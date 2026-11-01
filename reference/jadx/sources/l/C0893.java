package l;

import java.io.Closeable;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.֨ۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAUU */
/* JADX INFO: loaded from: classes2.dex */
public final class C0893 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18096 f3600;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6538 f3601;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static long[] f3599 = {-9164606388214699518L, -8720046426850100497L, -8649961213709896794L, -8165637398350707645L, -8109300701639721088L, -7966123100503199569L, -7921218830998286408L, -7775351613326101303L, -7768608037458185275L, -7766605818834748097L, -6835437086156813536L, -6316154655839304624L, -6179589609550493385L, -6025144546313590215L, -5939269048541779808L, -5885964883385605994L, -5764804792063216819L, -5472097725414717105L, -5194641081268104286L, -5076846148177416215L, -4837536971810737970L, -4703320437989596122L, -4608341446948126581L, -4537258998789938600L, -4438775680185074100L, -4314457471973557243L, -4150995715611818742L, -4082057040235125754L, -3975378478825053783L, -3935185854875733362L, -3319207949486691020L, -3077205613010077203L, -3053747177772160511L, -2995060141064716555L, -2825378362173150292L, -2533039401923731906L, -2439930098895578154L, -2378990704010641148L, -2364987994247679115L, -2262244760619952081L, -2192804397019347313L, -2095516571388852610L, -1872417015366588117L, -1650485814983027158L, -1589194880214235129L, -965955008570215305L, -905177026366752536L, -831789045734283466L, -582813228520337988L, -254670111376247151L, -219577392946377768L, -190281065685395680L, -26639035867733124L, -9822483067882491L, 4750336058574309L, 33238344207745342L, 156405680656087946L, 218512992947536312L, 313864100207897507L, 386461436234701831L, 823641066473609950L, 1073634739308289776L, 1153291637701043748L, 1203232727967308606L, 1214780596910349029L, 1459860845934817624L, 1502845958873959152L, 1534439610567445754L, 1698504441317515818L, 1818089308493370394L, 2078113382421334967L, 2164696723069287854L, 2622551729063269307L, 2653453629929770569L, 2660670623866180977L, 2731823439467737506L, 2836431254737891113L, 2930861374593775110L, 3085473968517218653L, 3089451460101527857L, 3114862868117605599L, 3129395579983849527L, 3256258368248066264L, 3452379460455804429L, 3547627781654598988L, 3637939656440441093L, 3688179072722109200L, 3718352661124136681L, 3730752432285826863L, 3794316665763266033L, 4000049462512838776L, 4046190361520671643L, 4147696707147271408L, 4193204392725694463L, 4241163808635564644L, 4254584350247334433L, 4814658433570175913L, 4841947709850912914L, 4904007817188630457L, 5100336081510080343L, 5274044858141538265L, 5347909877633654828L, 5450448828334921485L, 5474268165959054640L, 5545425291794704408L, 5596129856135573697L, 5688200883751798389L, 5751393439502795295L, 5944107969236155580L, 6007332606592876737L, 6280357960959217660L, 6456855723474196908L, 6511035576063254270L, 6534946468240507089L, 6584624952928234050L, 6734240326434096246L, 6742705432718011780L, 6854854816081053523L, 7045245923763966215L, 7123326897294507060L, 7179336928365889465L, 7240293012336844478L, 7347653049056829645L, 7375862386996623731L, 7442624256860549330L, 7617522210483516279L, 7658177784286215602L, 8055461369741094911L, 8389032537095247355L, 8409640769019589119L, 8488266005336625107L, 8537233257283452655L, 8838294710098435315L, 9140390920032557669L, 9140416208800006522L};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C0893 f3598 = new C0893();

    public C0893() {
        C18096 c18096 = new C18096();
        this.f3600 = c18096;
        this.f3601 = new C6538();
        C3010 c3010 = C3010.f11260;
        c18096.m42102(c3010, SimpleDateFormat.class);
        C0188 c0188 = C0188.f1309;
        c18096.m42102(c0188, Date.class);
        c18096.m42102(c0188, Calendar.class);
        C5127 c5127 = C5127.f17839;
        c18096.m42102(c5127, Map.class);
        c18096.m42102(c5127, HashMap.class);
        c18096.m42102(c5127, LinkedHashMap.class);
        c18096.m42102(c5127, TreeMap.class);
        c18096.m42102(c5127, ConcurrentMap.class);
        c18096.m42102(c5127, ConcurrentMapC13783.class);
        C19945 c19945 = C19945.f63889;
        c18096.m42102(c19945, Collection.class);
        c18096.m42102(c19945, List.class);
        c18096.m42102(c19945, ArrayList.class);
        C11478 c11478 = C11478.f38646;
        c18096.m42102(c11478, Object.class);
        c18096.m42102(C6807.f22956, String.class);
        c18096.m42102(c3010, Character.TYPE);
        c18096.m42102(c3010, Character.class);
        C13864 c13864 = C13864.f45705;
        c18096.m42102(c13864, Byte.TYPE);
        c18096.m42102(c13864, Byte.class);
        c18096.m42102(c13864, Short.TYPE);
        c18096.m42102(c13864, Short.class);
        C5833 c5833 = C5833.f19793;
        c18096.m42102(c5833, Integer.TYPE);
        c18096.m42102(c5833, Integer.class);
        c18096.m42102(c5833, Long.TYPE);
        c18096.m42102(c5833, Long.class);
        C20650 c20650 = C20650.f67222;
        c18096.m42102(c20650, BigInteger.class);
        c18096.m42102(c20650, BigDecimal.class);
        c18096.m42102(c13864, Float.TYPE);
        c18096.m42102(c13864, Float.class);
        c18096.m42102(c13864, Double.TYPE);
        c18096.m42102(c13864, Double.class);
        C15712 c15712 = C15712.f50998;
        c18096.m42102(c15712, Boolean.TYPE);
        c18096.m42102(c15712, Boolean.class);
        c18096.m42102(c3010, Class.class);
        C8656 c8656 = C8656.f29847;
        c18096.m42102(c8656, char[].class);
        c18096.m42102(c8656, Object[].class);
        c18096.m42102(c3010, UUID.class);
        c18096.m42102(c3010, TimeZone.class);
        c18096.m42102(c3010, Locale.class);
        c18096.m42102(c3010, Currency.class);
        c18096.m42102(c3010, URI.class);
        c18096.m42102(c3010, URL.class);
        c18096.m42102(c3010, Pattern.class);
        c18096.m42102(c3010, Charset.class);
        c18096.m42102(c13864, Number.class);
        c18096.m42102(c3010, StackTraceElement.class);
        c18096.m42102(c11478, Serializable.class);
        c18096.m42102(c11478, Cloneable.class);
        c18096.m42102(c11478, Comparable.class);
        c18096.m42102(c11478, Closeable.class);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7950 m3569(Type type) {
        InterfaceC7950 interfaceC7950 = (InterfaceC7950) this.f3600.m42101(type);
        if (interfaceC7950 != null) {
            return interfaceC7950;
        }
        if (type instanceof Class) {
            return m3568((Class) type, type);
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return m3568((Class) rawType, type);
            }
            return m3569(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length == 1) {
                return m3569(upperBounds[0]);
            }
        }
        return C11478.f38646;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7950 m3568(Class cls, Type type) {
        InterfaceC7950 c4421;
        InterfaceC5797 interfaceC5797;
        Class clsMappingTo;
        C18096 c18096 = this.f3600;
        InterfaceC7950 interfaceC7950 = (InterfaceC7950) c18096.m42101(type);
        if (interfaceC7950 != null) {
            return interfaceC7950;
        }
        if (type == null) {
            type = cls;
        }
        InterfaceC7950 interfaceC7951 = (InterfaceC7950) c18096.m42101(type);
        if (interfaceC7951 != null) {
            return interfaceC7951;
        }
        if (!m3566(cls) && (interfaceC5797 = (InterfaceC5797) cls.getAnnotation(InterfaceC5797.class)) != null && (clsMappingTo = interfaceC5797.mappingTo()) != Void.class) {
            return m3568(clsMappingTo, clsMappingTo);
        }
        if ((type instanceof WildcardType) || (type instanceof TypeVariable) || (type instanceof ParameterizedType)) {
            interfaceC7951 = (InterfaceC7950) c18096.m42101(cls);
        }
        if (interfaceC7951 != null) {
            return interfaceC7951;
        }
        InterfaceC7950 interfaceC7952 = (InterfaceC7950) c18096.m42101(type);
        if (interfaceC7952 != null) {
            return interfaceC7952;
        }
        if (cls.isEnum()) {
            c4421 = new C1563(cls);
        } else if (cls.isArray()) {
            c4421 = C8656.f29847;
        } else {
            C19945 c19945 = C19945.f63889;
            if (cls == Set.class || cls == HashSet.class || cls == Collection.class || cls == List.class || cls == ArrayList.class || Collection.class.isAssignableFrom(cls)) {
                c4421 = c19945;
            } else if (Map.class.isAssignableFrom(cls)) {
                c4421 = C5127.f17839;
            } else if (Throwable.class.isAssignableFrom(cls)) {
                c4421 = new C22767(this, cls, cls);
            } else if (cls.getName().equals("android.net.Uri")) {
                c4421 = C3010.f11260;
            } else {
                c4421 = new C4421(this, cls, type);
            }
        }
        c18096.m42102(c4421, type);
        return c4421;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m3566(Class cls) {
        return cls.isPrimitive() || cls == Boolean.class || cls == Character.class || cls == Byte.class || cls == Short.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == BigInteger.class || cls == BigDecimal.class || cls == String.class || cls == Date.class || cls == java.sql.Date.class || cls == Time.class || cls == Timestamp.class;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Class m3567(String str, int i, Class cls) {
        if (str == null) {
            return null;
        }
        if (str.length() < 128) {
            if (str.length() >= 3) {
                long jCharAt = (((long) str.charAt(0)) ^ (-3750763034362895579L)) * 1099511628211L;
                if (jCharAt == -5808493101479473382L) {
                    throw new C20614("autoType is not support. ".concat(str));
                }
                if ((jCharAt ^ ((long) C3184.m9601(1, str))) * 1099511628211L == 655701488918567152L) {
                    throw new C20614("autoType is not support. ".concat(str));
                }
                long jCharAt2 = (((((((long) str.charAt(0)) ^ (-3750763034362895579L)) * 1099511628211L) ^ ((long) str.charAt(1))) * 1099511628211L) ^ ((long) str.charAt(2))) * 1099511628211L;
                for (int i2 = 3; i2 < str.length(); i2++) {
                    jCharAt2 = (jCharAt2 ^ ((long) str.charAt(i2))) * 1099511628211L;
                    if (Arrays.binarySearch(f3599, jCharAt2) >= 0 && C8219.m21526(str) == null) {
                        throw new C20614("autoType is not support. ".concat(str));
                    }
                }
                Class clsM21526 = C8219.m21526(str);
                if (clsM21526 != null) {
                    return clsM21526;
                }
                Class clsM42100 = this.f3600.m42100(str);
                if (clsM42100 != null) {
                    return clsM42100;
                }
                Class<?> clsM21505 = C8219.m21505(str);
                if (clsM21505 != null && cls != null && clsM21505 != HashMap.class) {
                    if (cls.isAssignableFrom(clsM21505)) {
                        C8219.m21519(clsM21505, str);
                        return clsM21505;
                    }
                    StringBuilder sbM30914 = C12441.m30914("type not match. ", str, " -> ");
                    sbM30914.append(cls.getName());
                    throw new C20614(sbM30914.toString());
                }
                if (clsM21505.isAnnotationPresent(InterfaceC5797.class)) {
                    C8219.m21519(clsM21505, str);
                    return clsM21505;
                }
                int i3 = EnumC9326.SupportAutoType.f31669;
                if ((i & i3) == 0 && (i3 & AbstractC8620.f29749) == 0) {
                    throw new C20614("autoType is not support : ".concat(str));
                }
                C8219.m21519(clsM21505, str);
                return clsM21505;
            }
        }
        throw new C20614("autoType is not support. ".concat(str));
    }
}
