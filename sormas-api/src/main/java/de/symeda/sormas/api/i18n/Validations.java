package de.symeda.sormas.api.i18n;

public interface Validations {

	/*
	 * Hint for SonarQube issues:
	 * 1. java:S115: Violation of name convention for constants of this class is accepted: Close as false positive.
	 */

	public static String afterDate = "afterDate";
	public static String afterDateSoft = "afterDateSoft";
	public static String beforeDate = "beforeDate";
	public static String beforeDateSoft = "beforeDateSoft";
	public static String contactFollowUpUntilDate = "contactFollowUpUntilDate";
	public static String duplicateEpidNumber = "duplicateEpidNumber";
	public static String emptyOverwrittenFollowUpUntilDate = "emptyOverwrittenFollowUpUntilDate";
	public static String exportNoNameSpecified = "exportNoNameSpecified";
	public static String futureDate = "futureDate";
	public static String futureDateStrict = "futureDateStrict";
	public static String importCasesPropertyTypeNotAllowed = "importCasesPropertyTypeNotAllowed";
	public static String importCasesUnexpectedError = "importCasesUnexpectedError";
	public static String importCommunityAlreadyExists = "importCommunityAlreadyExists";
	public static String importCommunityNotUnique = "importCommunityNotUnique";
	public static String importDistrictAlreadyExists = "importDistrictAlreadyExists";
	public static String importDistrictNotUnique = "importDistrictNotUnique";
	public static String importEntryDoesNotExist = "importEntryDoesNotExist";
	public static String importEntryDoesNotExistDbOrCommunity = "importEntryDoesNotExistDbOrCommunity";
	public static String importEntryDoesNotExistDbOrDistrict = "importEntryDoesNotExistDbOrDistrict";
	public static String importEntryDoesNotExistDbOrRegion = "importEntryDoesNotExistDbOrRegion";
	public static String importErrorInColumn = "importErrorInColumn";
	public static String importFacilityAlreadyExists = "importFacilityAlreadyExists";
	public static String importFacilityNotUniqueInCommunity = "importFacilityNotUniqueInCommunity";
	public static String importFacilityNotUniqueInDistrict = "importFacilityNotUniqueInDistrict";
	public static String importInvalidDate = "importInvalidDate";
	public static String importLabNotUnique = "importLabNotUnique";
	public static String importLaboratoryAlreadyExists = "importLaboratoryAlreadyExists";
	public static String importLineTooLong = "importLineTooLong";
	public static String importPointOfEntryAlreadyExists = "importPointOfEntryAlreadyExists";
	public static String importPointOfEntryNotUniqueInDistrict = "importPointOfEntryNotUniqueInDistrict";
	public static String importPropertyTypeNotAllowed = "importPropertyTypeNotAllowed";
	public static String importRegionAlreadyExists = "importRegionAlreadyExists";
	public static String importRegionNotUnique = "importRegionNotUnique";
	public static String importUnexpectedError = "importUnexpectedError";
	public static String investigationStatusUnclassifiedCase = "investigationStatusUnclassifiedCase";
	public static String noCommunityInDistrict = "noCommunityInDistrict";
	public static String noDistrictInRegion = "noDistrictInRegion";
	public static String noFacilityDetails = "noFacilityDetails";
	public static String noFacilityInCommunity = "noFacilityInCommunity";
	public static String noFacilityInDistrict = "noFacilityInDistrict";
	public static String noFacilityInRegion = "noFacilityInRegion";
	public static String noPastDateAllowed = "noPastDateAllowed";
	public static String onlyDecimalNumbersAllowed = "onlyDecimalNumbersAllowed";
	public static String onlyGeoCoordinatesAllowed = "onlyGeoCoordinatesAllowed";
	public static String onlyNumbersAllowed = "onlyNumbersAllowed";
	public static String phoneNumberValidation = "phoneNumberValidation";
	public static String required = "required";
	public static String softAddEntryToList = "softAddEntryToList";
	public static String softApproximateAgeTooHigh = "softApproximateAgeTooHigh";
	public static String specifyFirstName = "specifyFirstName";
	public static String specifyLastName = "specifyLastName";
	public static String statisticsIncidenceOnlyNumbersAllowed = "statisticsIncidenceOnlyNumbersAllowed";
	public static String userNameNotUnique = "userNameNotUnique";
	public static String validCase = "validCase";
	public static String validCommunity = "validCommunity";
	public static String validDisease = "validDisease";
	public static String validDistrict = "validDistrict";
	public static String validFacility = "validFacility";
	public static String validPerson = "validPerson";
	public static String validPointOfEntry = "validPointOfEntry";
	public static String validRegion = "validRegion";
	public static String validReportDateTime = "validReportDateTime";
	public static String validReportingUser = "validReportingUser";
	public static String validSample = "validSample";
	public static String visitAfterFollowUp = "visitAfterFollowUp";
	public static String visitBeforeContactReport = "visitBeforeContactReport";
	public static String visitBeforeLastContactDate = "visitBeforeLastContactDate";
	public static String visitDate = "visitDate";
	public static String visitStatus = "visitStatus";
	public static String visitSymptoms = "visitSymptoms";
}
