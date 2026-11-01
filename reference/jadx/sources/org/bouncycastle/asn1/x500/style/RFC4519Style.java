package org.bouncycastle.asn1.x500.style;

import com.rosan.dhizuku.shared.DhizukuVariables;
import com.umeng.analytics.pro.am;
import java.util.Hashtable;
import l.C1679;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;

/* JADX INFO: loaded from: classes.dex */
public class RFC4519Style extends AbstractX500NameStyle {
    public static final Hashtable DefaultLookUp;
    public static final Hashtable DefaultSymbols;
    public static final X500NameStyle INSTANCE;
    public static final ASN1ObjectIdentifier businessCategory;
    public static final ASN1ObjectIdentifier c;
    public static final ASN1ObjectIdentifier cn;
    public static final ASN1ObjectIdentifier dc;
    public static final ASN1ObjectIdentifier description;
    public static final ASN1ObjectIdentifier destinationIndicator;
    public static final ASN1ObjectIdentifier distinguishedName;
    public static final ASN1ObjectIdentifier dnQualifier;
    public static final ASN1ObjectIdentifier enhancedSearchGuide;
    public static final ASN1ObjectIdentifier facsimileTelephoneNumber;
    public static final ASN1ObjectIdentifier generationQualifier;
    public static final ASN1ObjectIdentifier givenName;
    public static final ASN1ObjectIdentifier houseIdentifier;
    public static final ASN1ObjectIdentifier initials;
    public static final ASN1ObjectIdentifier internationalISDNNumber;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f77969l;
    public static final ASN1ObjectIdentifier member;
    public static final ASN1ObjectIdentifier name;
    public static final ASN1ObjectIdentifier o;
    public static final ASN1ObjectIdentifier ou;
    public static final ASN1ObjectIdentifier owner;
    public static final ASN1ObjectIdentifier physicalDeliveryOfficeName;
    public static final ASN1ObjectIdentifier postOfficeBox;
    public static final ASN1ObjectIdentifier postalAddress;
    public static final ASN1ObjectIdentifier postalCode;
    public static final ASN1ObjectIdentifier preferredDeliveryMethod;
    public static final ASN1ObjectIdentifier registeredAddress;
    public static final ASN1ObjectIdentifier roleOccupant;
    public static final ASN1ObjectIdentifier searchGuide;
    public static final ASN1ObjectIdentifier seeAlso;
    public static final ASN1ObjectIdentifier serialNumber;
    public static final ASN1ObjectIdentifier sn;
    public static final ASN1ObjectIdentifier st;
    public static final ASN1ObjectIdentifier street;
    public static final ASN1ObjectIdentifier telephoneNumber;
    public static final ASN1ObjectIdentifier teletexTerminalIdentifier;
    public static final ASN1ObjectIdentifier telexNumber;
    public static final ASN1ObjectIdentifier title;
    public static final ASN1ObjectIdentifier uid;
    public static final ASN1ObjectIdentifier uniqueMember;
    public static final ASN1ObjectIdentifier userPassword;
    public static final ASN1ObjectIdentifier x121Address;
    public static final ASN1ObjectIdentifier x500UniqueIdentifier;
    public final Hashtable defaultSymbols = AbstractX500NameStyle.copyHashTable(DefaultSymbols);
    public final Hashtable defaultLookUp = AbstractX500NameStyle.copyHashTable(DefaultLookUp);

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifierM5596 = C1679.m5596("2.5.4.15");
        businessCategory = aSN1ObjectIdentifierM5596;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM5597 = C1679.m5596("2.5.4.6");
        c = aSN1ObjectIdentifierM5597;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM5598 = C1679.m5596("2.5.4.3");
        cn = aSN1ObjectIdentifierM5598;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM5599 = C1679.m5596("0.9.2342.19200300.100.1.25");
        dc = aSN1ObjectIdentifierM5599;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55910 = C1679.m5596("2.5.4.13");
        description = aSN1ObjectIdentifierM55910;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55911 = C1679.m5596("2.5.4.27");
        destinationIndicator = aSN1ObjectIdentifierM55911;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55912 = C1679.m5596("2.5.4.49");
        distinguishedName = aSN1ObjectIdentifierM55912;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55913 = C1679.m5596("2.5.4.46");
        dnQualifier = aSN1ObjectIdentifierM55913;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55914 = C1679.m5596("2.5.4.47");
        enhancedSearchGuide = aSN1ObjectIdentifierM55914;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55915 = C1679.m5596("2.5.4.23");
        facsimileTelephoneNumber = aSN1ObjectIdentifierM55915;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55916 = C1679.m5596("2.5.4.44");
        generationQualifier = aSN1ObjectIdentifierM55916;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55917 = C1679.m5596("2.5.4.42");
        givenName = aSN1ObjectIdentifierM55917;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55918 = C1679.m5596("2.5.4.51");
        houseIdentifier = aSN1ObjectIdentifierM55918;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55919 = C1679.m5596("2.5.4.43");
        initials = aSN1ObjectIdentifierM55919;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55920 = C1679.m5596("2.5.4.25");
        internationalISDNNumber = aSN1ObjectIdentifierM55920;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55921 = C1679.m5596("2.5.4.7");
        f77969l = aSN1ObjectIdentifierM55921;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55922 = C1679.m5596("2.5.4.31");
        member = aSN1ObjectIdentifierM55922;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55923 = C1679.m5596("2.5.4.41");
        name = aSN1ObjectIdentifierM55923;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55924 = C1679.m5596("2.5.4.10");
        o = aSN1ObjectIdentifierM55924;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55925 = C1679.m5596("2.5.4.11");
        ou = aSN1ObjectIdentifierM55925;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55926 = C1679.m5596("2.5.4.32");
        owner = aSN1ObjectIdentifierM55926;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55927 = C1679.m5596("2.5.4.19");
        physicalDeliveryOfficeName = aSN1ObjectIdentifierM55927;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55928 = C1679.m5596("2.5.4.16");
        postalAddress = aSN1ObjectIdentifierM55928;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55929 = C1679.m5596("2.5.4.17");
        postalCode = aSN1ObjectIdentifierM55929;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55930 = C1679.m5596("2.5.4.18");
        postOfficeBox = aSN1ObjectIdentifierM55930;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55931 = C1679.m5596("2.5.4.28");
        preferredDeliveryMethod = aSN1ObjectIdentifierM55931;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55932 = C1679.m5596("2.5.4.26");
        registeredAddress = aSN1ObjectIdentifierM55932;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55933 = C1679.m5596("2.5.4.33");
        roleOccupant = aSN1ObjectIdentifierM55933;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55934 = C1679.m5596("2.5.4.14");
        searchGuide = aSN1ObjectIdentifierM55934;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55935 = C1679.m5596("2.5.4.34");
        seeAlso = aSN1ObjectIdentifierM55935;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55936 = C1679.m5596("2.5.4.5");
        serialNumber = aSN1ObjectIdentifierM55936;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55937 = C1679.m5596("2.5.4.4");
        sn = aSN1ObjectIdentifierM55937;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55938 = C1679.m5596("2.5.4.8");
        st = aSN1ObjectIdentifierM55938;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55939 = C1679.m5596("2.5.4.9");
        street = aSN1ObjectIdentifierM55939;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55940 = C1679.m5596("2.5.4.20");
        telephoneNumber = aSN1ObjectIdentifierM55940;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55941 = C1679.m5596("2.5.4.22");
        teletexTerminalIdentifier = aSN1ObjectIdentifierM55941;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55942 = C1679.m5596("2.5.4.21");
        telexNumber = aSN1ObjectIdentifierM55942;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55943 = C1679.m5596("2.5.4.12");
        title = aSN1ObjectIdentifierM55943;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55944 = C1679.m5596("0.9.2342.19200300.100.1.1");
        uid = aSN1ObjectIdentifierM55944;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55945 = C1679.m5596("2.5.4.50");
        uniqueMember = aSN1ObjectIdentifierM55945;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55946 = C1679.m5596("2.5.4.35");
        userPassword = aSN1ObjectIdentifierM55946;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55947 = C1679.m5596("2.5.4.24");
        x121Address = aSN1ObjectIdentifierM55947;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM55948 = C1679.m5596("2.5.4.45");
        x500UniqueIdentifier = aSN1ObjectIdentifierM55948;
        Hashtable hashtable = new Hashtable();
        DefaultSymbols = hashtable;
        Hashtable hashtable2 = new Hashtable();
        DefaultLookUp = hashtable2;
        hashtable.put(aSN1ObjectIdentifierM5596, "businessCategory");
        hashtable.put(aSN1ObjectIdentifierM5597, am.aF);
        hashtable.put(aSN1ObjectIdentifierM5598, "cn");
        hashtable.put(aSN1ObjectIdentifierM5599, "dc");
        hashtable.put(aSN1ObjectIdentifierM55910, "description");
        hashtable.put(aSN1ObjectIdentifierM55911, "destinationIndicator");
        hashtable.put(aSN1ObjectIdentifierM55912, "distinguishedName");
        hashtable.put(aSN1ObjectIdentifierM55913, "dnQualifier");
        hashtable.put(aSN1ObjectIdentifierM55914, "enhancedSearchGuide");
        hashtable.put(aSN1ObjectIdentifierM55915, "facsimileTelephoneNumber");
        hashtable.put(aSN1ObjectIdentifierM55916, "generationQualifier");
        hashtable.put(aSN1ObjectIdentifierM55917, "givenName");
        hashtable.put(aSN1ObjectIdentifierM55918, "houseIdentifier");
        hashtable.put(aSN1ObjectIdentifierM55919, "initials");
        hashtable.put(aSN1ObjectIdentifierM55920, "internationalISDNNumber");
        hashtable.put(aSN1ObjectIdentifierM55921, "l");
        hashtable.put(aSN1ObjectIdentifierM55922, "member");
        hashtable.put(aSN1ObjectIdentifierM55923, "name");
        hashtable.put(aSN1ObjectIdentifierM55924, "o");
        hashtable.put(aSN1ObjectIdentifierM55925, "ou");
        hashtable.put(aSN1ObjectIdentifierM55926, "owner");
        hashtable.put(aSN1ObjectIdentifierM55927, "physicalDeliveryOfficeName");
        hashtable.put(aSN1ObjectIdentifierM55928, "postalAddress");
        hashtable.put(aSN1ObjectIdentifierM55929, "postalCode");
        hashtable.put(aSN1ObjectIdentifierM55930, "postOfficeBox");
        hashtable.put(aSN1ObjectIdentifierM55931, "preferredDeliveryMethod");
        hashtable.put(aSN1ObjectIdentifierM55932, "registeredAddress");
        hashtable.put(aSN1ObjectIdentifierM55933, "roleOccupant");
        hashtable.put(aSN1ObjectIdentifierM55934, "searchGuide");
        hashtable.put(aSN1ObjectIdentifierM55935, "seeAlso");
        hashtable.put(aSN1ObjectIdentifierM55936, "serialNumber");
        hashtable.put(aSN1ObjectIdentifierM55937, "sn");
        hashtable.put(aSN1ObjectIdentifierM55938, "st");
        hashtable.put(aSN1ObjectIdentifierM55939, "street");
        hashtable.put(aSN1ObjectIdentifierM55940, "telephoneNumber");
        hashtable.put(aSN1ObjectIdentifierM55941, "teletexTerminalIdentifier");
        hashtable.put(aSN1ObjectIdentifierM55942, "telexNumber");
        hashtable.put(aSN1ObjectIdentifierM55943, "title");
        hashtable.put(aSN1ObjectIdentifierM55944, DhizukuVariables.PARAM_CLIENT_UID);
        hashtable.put(aSN1ObjectIdentifierM55945, "uniqueMember");
        hashtable.put(aSN1ObjectIdentifierM55946, "userPassword");
        hashtable.put(aSN1ObjectIdentifierM55947, "x121Address");
        hashtable.put(aSN1ObjectIdentifierM55948, "x500UniqueIdentifier");
        hashtable2.put("businesscategory", aSN1ObjectIdentifierM5596);
        hashtable2.put(am.aF, aSN1ObjectIdentifierM5597);
        hashtable2.put("cn", aSN1ObjectIdentifierM5598);
        hashtable2.put("dc", aSN1ObjectIdentifierM5599);
        hashtable2.put("description", aSN1ObjectIdentifierM55910);
        hashtable2.put("destinationindicator", aSN1ObjectIdentifierM55911);
        hashtable2.put("distinguishedname", aSN1ObjectIdentifierM55912);
        hashtable2.put("dnqualifier", aSN1ObjectIdentifierM55913);
        hashtable2.put("enhancedsearchguide", aSN1ObjectIdentifierM55914);
        hashtable2.put("facsimiletelephonenumber", aSN1ObjectIdentifierM55915);
        hashtable2.put("generationqualifier", aSN1ObjectIdentifierM55916);
        hashtable2.put("givenname", aSN1ObjectIdentifierM55917);
        hashtable2.put("houseidentifier", aSN1ObjectIdentifierM55918);
        hashtable2.put("initials", aSN1ObjectIdentifierM55919);
        hashtable2.put("internationalisdnnumber", aSN1ObjectIdentifierM55920);
        hashtable2.put("l", aSN1ObjectIdentifierM55921);
        hashtable2.put("member", aSN1ObjectIdentifierM55922);
        hashtable2.put("name", aSN1ObjectIdentifierM55923);
        hashtable2.put("o", aSN1ObjectIdentifierM55924);
        hashtable2.put("ou", aSN1ObjectIdentifierM55925);
        hashtable2.put("owner", aSN1ObjectIdentifierM55926);
        hashtable2.put("physicaldeliveryofficename", aSN1ObjectIdentifierM55927);
        hashtable2.put("postaladdress", aSN1ObjectIdentifierM55928);
        hashtable2.put("postalcode", aSN1ObjectIdentifierM55929);
        hashtable2.put("postofficebox", aSN1ObjectIdentifierM55930);
        hashtable2.put("preferreddeliverymethod", aSN1ObjectIdentifierM55931);
        hashtable2.put("registeredaddress", aSN1ObjectIdentifierM55932);
        hashtable2.put("roleoccupant", aSN1ObjectIdentifierM55933);
        hashtable2.put("searchguide", aSN1ObjectIdentifierM55934);
        hashtable2.put("seealso", aSN1ObjectIdentifierM55935);
        hashtable2.put("serialnumber", aSN1ObjectIdentifierM55936);
        hashtable2.put("sn", aSN1ObjectIdentifierM55937);
        hashtable2.put("st", aSN1ObjectIdentifierM55938);
        hashtable2.put("street", aSN1ObjectIdentifierM55939);
        hashtable2.put("telephonenumber", aSN1ObjectIdentifierM55940);
        hashtable2.put("teletexterminalidentifier", aSN1ObjectIdentifierM55941);
        hashtable2.put("telexnumber", aSN1ObjectIdentifierM55942);
        hashtable2.put("title", aSN1ObjectIdentifierM55943);
        hashtable2.put(DhizukuVariables.PARAM_CLIENT_UID, aSN1ObjectIdentifierM55944);
        hashtable2.put("uniquemember", aSN1ObjectIdentifierM55945);
        hashtable2.put("userpassword", aSN1ObjectIdentifierM55946);
        hashtable2.put("x121address", aSN1ObjectIdentifierM55947);
        hashtable2.put("x500uniqueidentifier", aSN1ObjectIdentifierM55948);
        INSTANCE = new RFC4519Style();
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public ASN1ObjectIdentifier attrNameToOID(String str) {
        return IETFUtils.decodeAttrName(str, this.defaultLookUp);
    }

    @Override // org.bouncycastle.asn1.x500.style.AbstractX500NameStyle
    public ASN1Encodable encodeStringValue(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) dc)) {
            return new DERIA5String(str);
        }
        return (aSN1ObjectIdentifier.equals((ASN1Primitive) c) || aSN1ObjectIdentifier.equals((ASN1Primitive) serialNumber) || aSN1ObjectIdentifier.equals((ASN1Primitive) dnQualifier) || aSN1ObjectIdentifier.equals((ASN1Primitive) telephoneNumber)) ? new DERPrintableString(str) : super.encodeStringValue(aSN1ObjectIdentifier, str);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public RDN[] fromString(String str) {
        RDN[] rdnArrRDNsFromString = IETFUtils.rDNsFromString(str, this);
        int length = rdnArrRDNsFromString.length;
        RDN[] rdnArr = new RDN[length];
        for (int i = 0; i != rdnArrRDNsFromString.length; i++) {
            rdnArr[(length - i) - 1] = rdnArrRDNsFromString[i];
        }
        return rdnArr;
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
        RDN[] rDNs = x500Name.getRDNs();
        boolean z = true;
        for (int length = rDNs.length - 1; length >= 0; length--) {
            if (z) {
                z = false;
            } else {
                sb.append(',');
            }
            IETFUtils.appendRDN(sb, rDNs[length], this.defaultSymbols);
        }
        return sb.toString();
    }
}
