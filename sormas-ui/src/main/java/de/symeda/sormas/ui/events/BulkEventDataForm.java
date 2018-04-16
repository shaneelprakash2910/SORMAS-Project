package de.symeda.sormas.ui.events;

import java.util.Arrays;

import com.vaadin.ui.CheckBox;
import com.vaadin.ui.OptionGroup;

import de.symeda.sormas.api.event.EventDto;
import de.symeda.sormas.ui.utils.AbstractEditForm;
import de.symeda.sormas.ui.utils.CssStyles;
import de.symeda.sormas.ui.utils.FieldHelper;
import de.symeda.sormas.ui.utils.LayoutUtil;

@SuppressWarnings("serial")
public class BulkEventDataForm extends AbstractEditForm<EventDto> {

	private static final String EVENT_STATUS_CHECKBOX = "eventStatusCheckbox";
	private static final String EVENT_TYPE_CHECKBOX = "eventTypeCheckbox";
	
	private static final String HTML_LAYOUT =
			LayoutUtil.fluidRowLocsCss(CssStyles.VSPACE_4, EVENT_STATUS_CHECKBOX) +
			LayoutUtil.fluidRowLocs(EventDto.EVENT_STATUS) +
			LayoutUtil.fluidRowLocsCss(CssStyles.VSPACE_4, EVENT_TYPE_CHECKBOX) +
			LayoutUtil.fluidRowLocs(EventDto.EVENT_TYPE);

	private CheckBox eventStatusCheckBox;
	private CheckBox eventTypeCheckBox;
	
	public BulkEventDataForm() {
		super(EventDto.class, EventDto.I18N_PREFIX, null);
		setWidth(680, Unit.PIXELS);
		hideValidationUntilNextCommit();
	}
	
	@Override
	protected void addFields() {
		eventStatusCheckBox = new CheckBox("Change case classification");
		getContent().addComponent(eventStatusCheckBox, EVENT_STATUS_CHECKBOX);
		eventTypeCheckBox = new CheckBox("Change investigation status");
		getContent().addComponent(eventTypeCheckBox, EVENT_TYPE_CHECKBOX);
		OptionGroup eventStatus = addField(EventDto.EVENT_STATUS, OptionGroup.class);
		eventStatus.setEnabled(false);
		OptionGroup eventType = addField(EventDto.EVENT_TYPE, OptionGroup.class);
		eventType.setEnabled(false);
		
		FieldHelper.setRequiredWhen(getFieldGroup(), eventStatusCheckBox, Arrays.asList(EventDto.EVENT_STATUS), Arrays.asList(true));
		FieldHelper.setRequiredWhen(getFieldGroup(), eventTypeCheckBox, Arrays.asList(EventDto.EVENT_TYPE), Arrays.asList(true));
	
		eventStatusCheckBox.addValueChangeListener(e -> {
			eventStatus.setEnabled((boolean) e.getProperty().getValue());
		});
		eventTypeCheckBox.addValueChangeListener(e -> {
			eventType.setEnabled((boolean) e.getProperty().getValue());
		});
	}
	
	@Override
	protected String createHtmlLayout() {
		return HTML_LAYOUT;
	}

	public CheckBox getEventStatusCheckBox() {
		return eventStatusCheckBox;
	}

	public CheckBox getEventTypeCheckBox() {
		return eventTypeCheckBox;
	}
	
}