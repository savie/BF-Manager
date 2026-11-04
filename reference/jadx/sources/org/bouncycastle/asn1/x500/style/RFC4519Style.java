package org.bouncycastle.asn1.x500.style;

import com.rosan.dhizuku.shared.DhizukuVariables;
import com.umeng.analytics.pro.am;
import java.util.Hashtable;
import l.C20138;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;

/* JADX INFO: loaded from: classes2.dex */
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
    public static final ASN1ObjectIdentifier f82085l;
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
        ASN1ObjectIdentifier aSN1ObjectIdentifierM46365 = C20138.m46365("2.5.4.15");
        businessCategory = aSN1ObjectIdentifierM46365;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM46366 = C20138.m46365("2.5.4.6");
        c = aSN1ObjectIdentifierM46366;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM46367 = C20138.m46365("2.5.4.3");
        cn = aSN1ObjectIdentifierM46367;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM46368 = C20138.m46365("0.9.2342.19200300.100.1.25");
        dc = aSN1ObjectIdentifierM46368;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM46369 = C20138.m46365("2.5.4.13");
        description = aSN1ObjectIdentifierM46369;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM463610 = C20138.m46365("2.5.4.27");
        destinationIndicator = aSN1ObjectIdentifierM463610;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM463611 = C20138.m46365("2.5.4.49");
        distinguishedName = aSN1ObjectIdentifierM463611;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM463612 = C20138.m46365("2.5.4.46");
        dnQualifier = aSN1ObjectIdentifierM463612;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM463613 = C20138.m46365("2.5.4.47");
        enhancedSearchGuide = aSN1ObjectIdentifierM463613;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM463614 = C20138.m46365("2.5.4.23");
        facsimileTelephoneNumber = aSN1ObjectIdentifierM463614;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM463615 = C20138.m46365("2.5.4.44");
        generationQualifier = aSN1ObjectIdentifierM463615;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM463616 = C20138.m46365("2.5.4.42");
        givenName = aSN1ObjectIdentifierM463616;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM463617 = C20138.m46365("2.5.4.51");
        houseIdentifier = aSN1ObjectIdentifierM463617;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM463618 = C20138.m46365("2.5.4.43");
        initials = aSN1ObjectIdentifierM463618;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM463619 = C20138.m46365("2.5.4.25");
        internationalISDNNumber = aSN1ObjectIdentifierM463619;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM463620 = C20138.m46365("2.5.4.7");
        f82085l = aSN1ObjectIdentifierM463620;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM463621 = C20138.m46365("2.5.4.31");
        member = aSN1ObjectIdentifierM463621;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM463622 = C20138.m46365("2.5.4.41");
        name = aSN1ObjectIdentifierM463622;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM463623 = C20138.m46365("2.5.4.10");
        o = aSN1ObjectIdentifierM463623;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM463624 = C20138.m46365("2.5.4.11");
        ou = aSN1ObjectIdentifierM463624;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM463625 = C20138.m46365("2.5.4.32");
        owner = aSN1ObjectIdentifierM463625;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM463626 = C20138.m46365("2.5.4.19");
        physicalDeliveryOfficeName = aSN1ObjectIdentifierM463626;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM463627 = C20138.m46365("2.5.4.16");
        postalAddress = aSN1ObjectIdentifierM463627;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM463628 = C20138.m46365("2.5.4.17");
        postalCode = aSN1ObjectIdentifierM463628;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM463629 = C20138.m46365("2.5.4.18");
        postOfficeBox = aSN1ObjectIdentifierM463629;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM463630 = C20138.m46365("2.5.4.28");
        preferredDeliveryMethod = aSN1ObjectIdentifierM463630;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM463631 = C20138.m46365("2.5.4.26");
        registeredAddress = aSN1ObjectIdentifierM463631;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM463632 = C20138.m46365("2.5.4.33");
        roleOccupant = aSN1ObjectIdentifierM463632;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM463633 = C20138.m46365("2.5.4.14");
        searchGuide = aSN1ObjectIdentifierM463633;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM463634 = C20138.m46365("2.5.4.34");
        seeAlso = aSN1ObjectIdentifierM463634;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM463635 = C20138.m46365("2.5.4.5");
        serialNumber = aSN1ObjectIdentifierM463635;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM463636 = C20138.m46365("2.5.4.4");
        sn = aSN1ObjectIdentifierM463636;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM463637 = C20138.m46365("2.5.4.8");
        st = aSN1ObjectIdentifierM463637;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM463638 = C20138.m46365("2.5.4.9");
        street = aSN1ObjectIdentifierM463638;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM463639 = C20138.m46365("2.5.4.20");
        telephoneNumber = aSN1ObjectIdentifierM463639;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM463640 = C20138.m46365("2.5.4.22");
        teletexTerminalIdentifier = aSN1ObjectIdentifierM463640;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM463641 = C20138.m46365("2.5.4.21");
        telexNumber = aSN1ObjectIdentifierM463641;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM463642 = C20138.m46365("2.5.4.12");
        title = aSN1ObjectIdentifierM463642;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM463643 = C20138.m46365("0.9.2342.19200300.100.1.1");
        uid = aSN1ObjectIdentifierM463643;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM463644 = C20138.m46365("2.5.4.50");
        uniqueMember = aSN1ObjectIdentifierM463644;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM463645 = C20138.m46365("2.5.4.35");
        userPassword = aSN1ObjectIdentifierM463645;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM463646 = C20138.m46365("2.5.4.24");
        x121Address = aSN1ObjectIdentifierM463646;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM463647 = C20138.m46365("2.5.4.45");
        x500UniqueIdentifier = aSN1ObjectIdentifierM463647;
        Hashtable hashtable = new Hashtable();
        DefaultSymbols = hashtable;
        Hashtable hashtable2 = new Hashtable();
        DefaultLookUp = hashtable2;
        hashtable.put(aSN1ObjectIdentifierM46365, "businessCategory");
        hashtable.put(aSN1ObjectIdentifierM46366, am.aF);
        hashtable.put(aSN1ObjectIdentifierM46367, "cn");
        hashtable.put(aSN1ObjectIdentifierM46368, "dc");
        hashtable.put(aSN1ObjectIdentifierM46369, "description");
        hashtable.put(aSN1ObjectIdentifierM463610, "destinationIndicator");
        hashtable.put(aSN1ObjectIdentifierM463611, "distinguishedName");
        hashtable.put(aSN1ObjectIdentifierM463612, "dnQualifier");
        hashtable.put(aSN1ObjectIdentifierM463613, "enhancedSearchGuide");
        hashtable.put(aSN1ObjectIdentifierM463614, "facsimileTelephoneNumber");
        hashtable.put(aSN1ObjectIdentifierM463615, "generationQualifier");
        hashtable.put(aSN1ObjectIdentifierM463616, "givenName");
        hashtable.put(aSN1ObjectIdentifierM463617, "houseIdentifier");
        hashtable.put(aSN1ObjectIdentifierM463618, "initials");
        hashtable.put(aSN1ObjectIdentifierM463619, "internationalISDNNumber");
        hashtable.put(aSN1ObjectIdentifierM463620, "l");
        hashtable.put(aSN1ObjectIdentifierM463621, "member");
        hashtable.put(aSN1ObjectIdentifierM463622, "name");
        hashtable.put(aSN1ObjectIdentifierM463623, "o");
        hashtable.put(aSN1ObjectIdentifierM463624, "ou");
        hashtable.put(aSN1ObjectIdentifierM463625, "owner");
        hashtable.put(aSN1ObjectIdentifierM463626, "physicalDeliveryOfficeName");
        hashtable.put(aSN1ObjectIdentifierM463627, "postalAddress");
        hashtable.put(aSN1ObjectIdentifierM463628, "postalCode");
        hashtable.put(aSN1ObjectIdentifierM463629, "postOfficeBox");
        hashtable.put(aSN1ObjectIdentifierM463630, "preferredDeliveryMethod");
        hashtable.put(aSN1ObjectIdentifierM463631, "registeredAddress");
        hashtable.put(aSN1ObjectIdentifierM463632, "roleOccupant");
        hashtable.put(aSN1ObjectIdentifierM463633, "searchGuide");
        hashtable.put(aSN1ObjectIdentifierM463634, "seeAlso");
        hashtable.put(aSN1ObjectIdentifierM463635, "serialNumber");
        hashtable.put(aSN1ObjectIdentifierM463636, "sn");
        hashtable.put(aSN1ObjectIdentifierM463637, "st");
        hashtable.put(aSN1ObjectIdentifierM463638, "street");
        hashtable.put(aSN1ObjectIdentifierM463639, "telephoneNumber");
        hashtable.put(aSN1ObjectIdentifierM463640, "teletexTerminalIdentifier");
        hashtable.put(aSN1ObjectIdentifierM463641, "telexNumber");
        hashtable.put(aSN1ObjectIdentifierM463642, "title");
        hashtable.put(aSN1ObjectIdentifierM463643, DhizukuVariables.PARAM_CLIENT_UID);
        hashtable.put(aSN1ObjectIdentifierM463644, "uniqueMember");
        hashtable.put(aSN1ObjectIdentifierM463645, "userPassword");
        hashtable.put(aSN1ObjectIdentifierM463646, "x121Address");
        hashtable.put(aSN1ObjectIdentifierM463647, "x500UniqueIdentifier");
        hashtable2.put("businesscategory", aSN1ObjectIdentifierM46365);
        hashtable2.put(am.aF, aSN1ObjectIdentifierM46366);
        hashtable2.put("cn", aSN1ObjectIdentifierM46367);
        hashtable2.put("dc", aSN1ObjectIdentifierM46368);
        hashtable2.put("description", aSN1ObjectIdentifierM46369);
        hashtable2.put("destinationindicator", aSN1ObjectIdentifierM463610);
        hashtable2.put("distinguishedname", aSN1ObjectIdentifierM463611);
        hashtable2.put("dnqualifier", aSN1ObjectIdentifierM463612);
        hashtable2.put("enhancedsearchguide", aSN1ObjectIdentifierM463613);
        hashtable2.put("facsimiletelephonenumber", aSN1ObjectIdentifierM463614);
        hashtable2.put("generationqualifier", aSN1ObjectIdentifierM463615);
        hashtable2.put("givenname", aSN1ObjectIdentifierM463616);
        hashtable2.put("houseidentifier", aSN1ObjectIdentifierM463617);
        hashtable2.put("initials", aSN1ObjectIdentifierM463618);
        hashtable2.put("internationalisdnnumber", aSN1ObjectIdentifierM463619);
        hashtable2.put("l", aSN1ObjectIdentifierM463620);
        hashtable2.put("member", aSN1ObjectIdentifierM463621);
        hashtable2.put("name", aSN1ObjectIdentifierM463622);
        hashtable2.put("o", aSN1ObjectIdentifierM463623);
        hashtable2.put("ou", aSN1ObjectIdentifierM463624);
        hashtable2.put("owner", aSN1ObjectIdentifierM463625);
        hashtable2.put("physicaldeliveryofficename", aSN1ObjectIdentifierM463626);
        hashtable2.put("postaladdress", aSN1ObjectIdentifierM463627);
        hashtable2.put("postalcode", aSN1ObjectIdentifierM463628);
        hashtable2.put("postofficebox", aSN1ObjectIdentifierM463629);
        hashtable2.put("preferreddeliverymethod", aSN1ObjectIdentifierM463630);
        hashtable2.put("registeredaddress", aSN1ObjectIdentifierM463631);
        hashtable2.put("roleoccupant", aSN1ObjectIdentifierM463632);
        hashtable2.put("searchguide", aSN1ObjectIdentifierM463633);
        hashtable2.put("seealso", aSN1ObjectIdentifierM463634);
        hashtable2.put("serialnumber", aSN1ObjectIdentifierM463635);
        hashtable2.put("sn", aSN1ObjectIdentifierM463636);
        hashtable2.put("st", aSN1ObjectIdentifierM463637);
        hashtable2.put("street", aSN1ObjectIdentifierM463638);
        hashtable2.put("telephonenumber", aSN1ObjectIdentifierM463639);
        hashtable2.put("teletexterminalidentifier", aSN1ObjectIdentifierM463640);
        hashtable2.put("telexnumber", aSN1ObjectIdentifierM463641);
        hashtable2.put("title", aSN1ObjectIdentifierM463642);
        hashtable2.put(DhizukuVariables.PARAM_CLIENT_UID, aSN1ObjectIdentifierM463643);
        hashtable2.put("uniquemember", aSN1ObjectIdentifierM463644);
        hashtable2.put("userpassword", aSN1ObjectIdentifierM463645);
        hashtable2.put("x121address", aSN1ObjectIdentifierM463646);
        hashtable2.put("x500uniqueidentifier", aSN1ObjectIdentifierM463647);
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
