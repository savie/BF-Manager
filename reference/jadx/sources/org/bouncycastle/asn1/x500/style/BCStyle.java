package org.bouncycastle.asn1.x500.style;

import com.rosan.dhizuku.shared.DhizukuVariables;
import com.umeng.analytics.pro.am;
import java.util.Hashtable;
import l.C1679;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;

/* JADX INFO: loaded from: classes.dex */
public class BCStyle extends AbstractX500NameStyle {
    public static final ASN1ObjectIdentifier BUSINESS_CATEGORY;
    public static final ASN1ObjectIdentifier C;
    public static final ASN1ObjectIdentifier CN;
    public static final ASN1ObjectIdentifier COUNTRY_OF_CITIZENSHIP;
    public static final ASN1ObjectIdentifier COUNTRY_OF_RESIDENCE;
    public static final ASN1ObjectIdentifier DATE_OF_BIRTH;
    public static final ASN1ObjectIdentifier DC;
    public static final ASN1ObjectIdentifier DESCRIPTION;
    public static final ASN1ObjectIdentifier DMD_NAME;
    public static final ASN1ObjectIdentifier DN_QUALIFIER;
    public static final Hashtable DefaultLookUp;
    public static final Hashtable DefaultSymbols;
    public static final ASN1ObjectIdentifier E;
    public static final ASN1ObjectIdentifier EmailAddress;
    public static final ASN1ObjectIdentifier GENDER;
    public static final ASN1ObjectIdentifier GENERATION;
    public static final ASN1ObjectIdentifier GIVENNAME;
    public static final ASN1ObjectIdentifier INITIALS;
    public static final X500NameStyle INSTANCE;
    public static final ASN1ObjectIdentifier JURISDICTION_C;
    public static final ASN1ObjectIdentifier JURISDICTION_L;
    public static final ASN1ObjectIdentifier JURISDICTION_ST;
    public static final ASN1ObjectIdentifier L;
    public static final ASN1ObjectIdentifier NAME;
    public static final ASN1ObjectIdentifier NAME_AT_BIRTH;
    public static final ASN1ObjectIdentifier O;
    public static final ASN1ObjectIdentifier ORGANIZATION_IDENTIFIER;
    public static final ASN1ObjectIdentifier OU;
    public static final ASN1ObjectIdentifier PLACE_OF_BIRTH;
    public static final ASN1ObjectIdentifier POSTAL_ADDRESS;
    public static final ASN1ObjectIdentifier POSTAL_CODE;
    public static final ASN1ObjectIdentifier PSEUDONYM;
    public static final ASN1ObjectIdentifier ROLE;
    public static final ASN1ObjectIdentifier SERIALNUMBER;
    public static final ASN1ObjectIdentifier SN;
    public static final ASN1ObjectIdentifier ST;
    public static final ASN1ObjectIdentifier STREET;
    public static final ASN1ObjectIdentifier SURNAME;
    public static final ASN1ObjectIdentifier T;
    public static final ASN1ObjectIdentifier TELEPHONE_NUMBER;
    public static final ASN1ObjectIdentifier UID;
    public static final ASN1ObjectIdentifier UNIQUE_IDENTIFIER;
    public static final ASN1ObjectIdentifier UnstructuredAddress;
    public static final ASN1ObjectIdentifier UnstructuredName;
    public final Hashtable defaultSymbols = AbstractX500NameStyle.copyHashTable(DefaultSymbols);
    public final Hashtable defaultLookUp = AbstractX500NameStyle.copyHashTable(DefaultLookUp);

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifierM5596 = C1679.m5596("2.5.4.6");
        C = aSN1ObjectIdentifierM5596;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM5597 = C1679.m5596("2.5.4.10");
        O = aSN1ObjectIdentifierM5597;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM5598 = C1679.m5596("2.5.4.11");
        OU = aSN1ObjectIdentifierM5598;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM5599 = C1679.m5596("2.5.4.12");
        T = aSN1ObjectIdentifierM5599;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55910 = C1679.m5596("2.5.4.3");
        CN = aSN1ObjectIdentifierM55910;
        SN = C1679.m5596("2.5.4.5");
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55911 = C1679.m5596("2.5.4.9");
        STREET = aSN1ObjectIdentifierM55911;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55912 = C1679.m5596("2.5.4.5");
        SERIALNUMBER = aSN1ObjectIdentifierM55912;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55913 = C1679.m5596("2.5.4.7");
        L = aSN1ObjectIdentifierM55913;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55914 = C1679.m5596("2.5.4.8");
        ST = aSN1ObjectIdentifierM55914;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55915 = C1679.m5596("2.5.4.4");
        SURNAME = aSN1ObjectIdentifierM55915;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55916 = C1679.m5596("2.5.4.42");
        GIVENNAME = aSN1ObjectIdentifierM55916;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55917 = C1679.m5596("2.5.4.43");
        INITIALS = aSN1ObjectIdentifierM55917;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55918 = C1679.m5596("2.5.4.44");
        GENERATION = aSN1ObjectIdentifierM55918;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55919 = C1679.m5596("2.5.4.45");
        UNIQUE_IDENTIFIER = aSN1ObjectIdentifierM55919;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55920 = C1679.m5596("2.5.4.13");
        DESCRIPTION = aSN1ObjectIdentifierM55920;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55921 = C1679.m5596("2.5.4.15");
        BUSINESS_CATEGORY = aSN1ObjectIdentifierM55921;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55922 = C1679.m5596("2.5.4.17");
        POSTAL_CODE = aSN1ObjectIdentifierM55922;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55923 = C1679.m5596("2.5.4.46");
        DN_QUALIFIER = aSN1ObjectIdentifierM55923;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55924 = C1679.m5596("2.5.4.65");
        PSEUDONYM = aSN1ObjectIdentifierM55924;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55925 = C1679.m5596("2.5.4.72");
        ROLE = aSN1ObjectIdentifierM55925;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = X509ObjectIdentifiers.id_pda;
        ASN1ObjectIdentifier aSN1ObjectIdentifierIntern = aSN1ObjectIdentifier.branch("1").intern();
        DATE_OF_BIRTH = aSN1ObjectIdentifierIntern;
        ASN1ObjectIdentifier aSN1ObjectIdentifierIntern2 = aSN1ObjectIdentifier.branch("2").intern();
        PLACE_OF_BIRTH = aSN1ObjectIdentifierIntern2;
        ASN1ObjectIdentifier aSN1ObjectIdentifierIntern3 = aSN1ObjectIdentifier.branch("3").intern();
        GENDER = aSN1ObjectIdentifierIntern3;
        ASN1ObjectIdentifier aSN1ObjectIdentifierIntern4 = aSN1ObjectIdentifier.branch("4").intern();
        COUNTRY_OF_CITIZENSHIP = aSN1ObjectIdentifierIntern4;
        ASN1ObjectIdentifier aSN1ObjectIdentifierIntern5 = aSN1ObjectIdentifier.branch("5").intern();
        COUNTRY_OF_RESIDENCE = aSN1ObjectIdentifierIntern5;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55926 = C1679.m5596("1.3.36.8.3.14");
        NAME_AT_BIRTH = aSN1ObjectIdentifierM55926;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55927 = C1679.m5596("2.5.4.16");
        POSTAL_ADDRESS = aSN1ObjectIdentifierM55927;
        DMD_NAME = C1679.m5596("2.5.4.54");
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = X509ObjectIdentifiers.id_at_telephoneNumber;
        TELEPHONE_NUMBER = aSN1ObjectIdentifier2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = X509ObjectIdentifiers.id_at_name;
        NAME = aSN1ObjectIdentifier3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = X509ObjectIdentifiers.id_at_organizationIdentifier;
        ORGANIZATION_IDENTIFIER = aSN1ObjectIdentifier4;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = PKCSObjectIdentifiers.pkcs_9_at_emailAddress;
        EmailAddress = aSN1ObjectIdentifier5;
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = PKCSObjectIdentifiers.pkcs_9_at_unstructuredName;
        UnstructuredName = aSN1ObjectIdentifier6;
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = PKCSObjectIdentifiers.pkcs_9_at_unstructuredAddress;
        UnstructuredAddress = aSN1ObjectIdentifier7;
        E = aSN1ObjectIdentifier5;
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.25");
        DC = aSN1ObjectIdentifier8;
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.1");
        UID = aSN1ObjectIdentifier9;
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = new ASN1ObjectIdentifier("1.3.6.1.4.1.311.60.2.1.3");
        JURISDICTION_C = aSN1ObjectIdentifier10;
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = new ASN1ObjectIdentifier("1.3.6.1.4.1.311.60.2.1.2");
        JURISDICTION_ST = aSN1ObjectIdentifier11;
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = new ASN1ObjectIdentifier("1.3.6.1.4.1.311.60.2.1.1");
        JURISDICTION_L = aSN1ObjectIdentifier12;
        Hashtable hashtable = new Hashtable();
        DefaultSymbols = hashtable;
        Hashtable hashtable2 = new Hashtable();
        DefaultLookUp = hashtable2;
        hashtable.put(aSN1ObjectIdentifierM5596, "C");
        hashtable.put(aSN1ObjectIdentifierM5597, "O");
        hashtable.put(aSN1ObjectIdentifierM5599, "T");
        hashtable.put(aSN1ObjectIdentifierM5598, "OU");
        hashtable.put(aSN1ObjectIdentifierM55910, "CN");
        hashtable.put(aSN1ObjectIdentifierM55913, "L");
        hashtable.put(aSN1ObjectIdentifierM55914, "ST");
        hashtable.put(aSN1ObjectIdentifierM55912, "SERIALNUMBER");
        hashtable.put(aSN1ObjectIdentifier5, "E");
        hashtable.put(aSN1ObjectIdentifier8, "DC");
        hashtable.put(aSN1ObjectIdentifier9, "UID");
        hashtable.put(aSN1ObjectIdentifierM55911, "STREET");
        hashtable.put(aSN1ObjectIdentifierM55915, "SURNAME");
        hashtable.put(aSN1ObjectIdentifierM55916, "GIVENNAME");
        hashtable.put(aSN1ObjectIdentifierM55917, "INITIALS");
        hashtable.put(aSN1ObjectIdentifierM55918, "GENERATION");
        hashtable.put(aSN1ObjectIdentifierM55920, "DESCRIPTION");
        hashtable.put(aSN1ObjectIdentifierM55925, "ROLE");
        hashtable.put(aSN1ObjectIdentifier7, "unstructuredAddress");
        hashtable.put(aSN1ObjectIdentifier6, "unstructuredName");
        hashtable.put(aSN1ObjectIdentifierM55919, "UniqueIdentifier");
        hashtable.put(aSN1ObjectIdentifierM55923, "DN");
        hashtable.put(aSN1ObjectIdentifierM55924, "Pseudonym");
        hashtable.put(aSN1ObjectIdentifierM55927, "PostalAddress");
        hashtable.put(aSN1ObjectIdentifierM55926, "NameAtBirth");
        hashtable.put(aSN1ObjectIdentifierIntern4, "CountryOfCitizenship");
        hashtable.put(aSN1ObjectIdentifierIntern5, "CountryOfResidence");
        hashtable.put(aSN1ObjectIdentifierIntern3, "Gender");
        hashtable.put(aSN1ObjectIdentifierIntern2, "PlaceOfBirth");
        hashtable.put(aSN1ObjectIdentifierIntern, "DateOfBirth");
        hashtable.put(aSN1ObjectIdentifierM55922, "PostalCode");
        hashtable.put(aSN1ObjectIdentifierM55921, "BusinessCategory");
        hashtable.put(aSN1ObjectIdentifier2, "TelephoneNumber");
        hashtable.put(aSN1ObjectIdentifier3, "Name");
        hashtable.put(aSN1ObjectIdentifier4, "organizationIdentifier");
        hashtable.put(aSN1ObjectIdentifier10, "jurisdictionCountry");
        hashtable.put(aSN1ObjectIdentifier11, "jurisdictionState");
        hashtable.put(aSN1ObjectIdentifier12, "jurisdictionLocality");
        hashtable2.put(am.aF, aSN1ObjectIdentifierM5596);
        hashtable2.put("o", aSN1ObjectIdentifierM5597);
        hashtable2.put(am.aI, aSN1ObjectIdentifierM5599);
        hashtable2.put("ou", aSN1ObjectIdentifierM5598);
        hashtable2.put("cn", aSN1ObjectIdentifierM55910);
        hashtable2.put("l", aSN1ObjectIdentifierM55913);
        hashtable2.put("st", aSN1ObjectIdentifierM55914);
        hashtable2.put("sn", aSN1ObjectIdentifierM55915);
        hashtable2.put("serialnumber", aSN1ObjectIdentifierM55912);
        hashtable2.put("street", aSN1ObjectIdentifierM55911);
        hashtable2.put("emailaddress", aSN1ObjectIdentifier5);
        hashtable2.put("dc", aSN1ObjectIdentifier8);
        hashtable2.put("e", aSN1ObjectIdentifier5);
        hashtable2.put(DhizukuVariables.PARAM_CLIENT_UID, aSN1ObjectIdentifier9);
        hashtable2.put("surname", aSN1ObjectIdentifierM55915);
        hashtable2.put("givenname", aSN1ObjectIdentifierM55916);
        hashtable2.put("initials", aSN1ObjectIdentifierM55917);
        hashtable2.put("generation", aSN1ObjectIdentifierM55918);
        hashtable2.put("description", aSN1ObjectIdentifierM55920);
        hashtable2.put("role", aSN1ObjectIdentifierM55925);
        hashtable2.put("unstructuredaddress", aSN1ObjectIdentifier7);
        hashtable2.put("unstructuredname", aSN1ObjectIdentifier6);
        hashtable2.put("uniqueidentifier", aSN1ObjectIdentifierM55919);
        hashtable2.put("dn", aSN1ObjectIdentifierM55923);
        hashtable2.put("pseudonym", aSN1ObjectIdentifierM55924);
        hashtable2.put("postaladdress", aSN1ObjectIdentifierM55927);
        hashtable2.put("nameatbirth", aSN1ObjectIdentifierM55926);
        hashtable2.put("countryofcitizenship", aSN1ObjectIdentifierIntern4);
        hashtable2.put("countryofresidence", aSN1ObjectIdentifierIntern5);
        hashtable2.put("gender", aSN1ObjectIdentifierIntern3);
        hashtable2.put("placeofbirth", aSN1ObjectIdentifierIntern2);
        hashtable2.put("dateofbirth", aSN1ObjectIdentifierIntern);
        hashtable2.put("postalcode", aSN1ObjectIdentifierM55922);
        hashtable2.put("businesscategory", aSN1ObjectIdentifierM55921);
        hashtable2.put("telephonenumber", aSN1ObjectIdentifier2);
        hashtable2.put("name", aSN1ObjectIdentifier3);
        hashtable2.put("organizationidentifier", aSN1ObjectIdentifier4);
        hashtable2.put("jurisdictioncountry", aSN1ObjectIdentifier10);
        hashtable2.put("jurisdictionstate", aSN1ObjectIdentifier11);
        hashtable2.put("jurisdictionlocality", aSN1ObjectIdentifier12);
        INSTANCE = new BCStyle();
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public ASN1ObjectIdentifier attrNameToOID(String str) {
        return IETFUtils.decodeAttrName(str, this.defaultLookUp);
    }

    @Override // org.bouncycastle.asn1.x500.style.AbstractX500NameStyle
    public ASN1Encodable encodeStringValue(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) EmailAddress) || aSN1ObjectIdentifier.equals((ASN1Primitive) DC)) {
            return new DERIA5String(str);
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) DATE_OF_BIRTH)) {
            return new ASN1GeneralizedTime(str);
        }
        return (aSN1ObjectIdentifier.equals((ASN1Primitive) C) || aSN1ObjectIdentifier.equals((ASN1Primitive) SERIALNUMBER) || aSN1ObjectIdentifier.equals((ASN1Primitive) DN_QUALIFIER) || aSN1ObjectIdentifier.equals((ASN1Primitive) TELEPHONE_NUMBER) || aSN1ObjectIdentifier.equals((ASN1Primitive) JURISDICTION_C)) ? new DERPrintableString(str) : super.encodeStringValue(aSN1ObjectIdentifier, str);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public RDN[] fromString(String str) {
        return IETFUtils.rDNsFromString(str, this);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String[] oidToAttrNames(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return IETFUtils.findAttrNamesForOID(aSN1ObjectIdentifier, this.defaultLookUp);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String oidToDisplayName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (String) this.defaultSymbols.get(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String toString(X500Name x500Name) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (RDN rdn : x500Name.getRDNs()) {
            if (z) {
                z = false;
            } else {
                sb.append(',');
            }
            IETFUtils.appendRDN(sb, rdn, this.defaultSymbols);
        }
        return sb.toString();
    }
}
