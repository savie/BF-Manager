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

/* JADX INFO: renamed from: l.۫᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAUU */
/* JADX INFO: loaded from: classes4.dex */
public final class C13420 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static long[] f42746 = {-9164606388214699518L, -8720046426850100497L, -8649961213709896794L, -8165637398350707645L, -8109300701639721088L, -7966123100503199569L, -7921218830998286408L, -7775351613326101303L, -7768608037458185275L, -7766605818834748097L, -6835437086156813536L, -6316154655839304624L, -6179589609550493385L, -6025144546313590215L, -5939269048541779808L, -5885964883385605994L, -5764804792063216819L, -5472097725414717105L, -5194641081268104286L, -5076846148177416215L, -4837536971810737970L, -4703320437989596122L, -4608341446948126581L, -4537258998789938600L, -4438775680185074100L, -4314457471973557243L, -4150995715611818742L, -4082057040235125754L, -3975378478825053783L, -3935185854875733362L, -3319207949486691020L, -3077205613010077203L, -3053747177772160511L, -2995060141064716555L, -2825378362173150292L, -2533039401923731906L, -2439930098895578154L, -2378990704010641148L, -2364987994247679115L, -2262244760619952081L, -2192804397019347313L, -2095516571388852610L, -1872417015366588117L, -1650485814983027158L, -1589194880214235129L, -965955008570215305L, -905177026366752536L, -831789045734283466L, -582813228520337988L, -254670111376247151L, -219577392946377768L, -190281065685395680L, -26639035867733124L, -9822483067882491L, 4750336058574309L, 33238344207745342L, 156405680656087946L, 218512992947536312L, 313864100207897507L, 386461436234701831L, 823641066473609950L, 1073634739308289776L, 1153291637701043748L, 1203232727967308606L, 1214780596910349029L, 1459860845934817624L, 1502845958873959152L, 1534439610567445754L, 1698504441317515818L, 1818089308493370394L, 2078113382421334967L, 2164696723069287854L, 2622551729063269307L, 2653453629929770569L, 2660670623866180977L, 2731823439467737506L, 2836431254737891113L, 2930861374593775110L, 3085473968517218653L, 3089451460101527857L, 3114862868117605599L, 3129395579983849527L, 3256258368248066264L, 3452379460455804429L, 3547627781654598988L, 3637939656440441093L, 3688179072722109200L, 3718352661124136681L, 3730752432285826863L, 3794316665763266033L, 4000049462512838776L, 4046190361520671643L, 4147696707147271408L, 4193204392725694463L, 4241163808635564644L, 4254584350247334433L, 4814658433570175913L, 4841947709850912914L, 4904007817188630457L, 5100336081510080343L, 5274044858141538265L, 5347909877633654828L, 5450448828334921485L, 5474268165959054640L, 5545425291794704408L, 5596129856135573697L, 5688200883751798389L, 5751393439502795295L, 5944107969236155580L, 6007332606592876737L, 6280357960959217660L, 6456855723474196908L, 6511035576063254270L, 6534946468240507089L, 6584624952928234050L, 6734240326434096246L, 6742705432718011780L, 6854854816081053523L, 7045245923763966215L, 7123326897294507060L, 7179336928365889465L, 7240293012336844478L, 7347653049056829645L, 7375862386996623731L, 7442624256860549330L, 7617522210483516279L, 7658177784286215602L, 8055461369741094911L, 8389032537095247355L, 8409640769019589119L, 8488266005336625107L, 8537233257283452655L, 8838294710098435315L, 9140390920032557669L, 9140416208800006522L};

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C13420 f42747 = new C13420();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15812 f42748;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C11928 f42749;

    public C13420() {
        C15812 c15812 = new C15812();
        this.f42748 = c15812;
        this.f42749 = new C11928();
        C14165 c14165 = C14165.f44790;
        c15812.m37738(c14165, SimpleDateFormat.class);
        C18641 c18641 = C18641.f60610;
        c15812.m37738(c18641, Date.class);
        c15812.m37738(c18641, Calendar.class);
        C20133 c20133 = C20133.f64697;
        c15812.m37738(c20133, Map.class);
        c15812.m37738(c20133, HashMap.class);
        c15812.m37738(c20133, LinkedHashMap.class);
        c15812.m37738(c20133, TreeMap.class);
        c15812.m37738(c20133, ConcurrentMap.class);
        c15812.m37738(c20133, ConcurrentMapC17249.class);
        C21625 c21625 = C21625.f69049;
        c15812.m37738(c21625, Collection.class);
        c15812.m37738(c21625, List.class);
        c15812.m37738(c21625, ArrayList.class);
        C11182 c11182 = C11182.f35253;
        c15812.m37738(c11182, Object.class);
        c15812.m37738(C11337.f35710, String.class);
        c15812.m37738(c14165, Character.TYPE);
        c15812.m37738(c14165, Character.class);
        C21780 c21780 = C21780.f69456;
        c15812.m37738(c21780, Byte.TYPE);
        c15812.m37738(c21780, Byte.class);
        c15812.m37738(c21780, Short.TYPE);
        c15812.m37738(c21780, Short.class);
        C10436 c10436 = C10436.f33163;
        c15812.m37738(c10436, Integer.TYPE);
        c15812.m37738(c10436, Integer.class);
        c15812.m37738(c10436, Long.TYPE);
        c15812.m37738(c10436, Long.class);
        C4471 c4471 = C4471.f15987;
        c15812.m37738(c4471, BigInteger.class);
        c15812.m37738(c4471, BigDecimal.class);
        c15812.m37738(c21780, Float.TYPE);
        c15812.m37738(c21780, Float.class);
        c15812.m37738(c21780, Double.TYPE);
        c15812.m37738(c21780, Double.class);
        C14911 c14911 = C14911.f48696;
        c15812.m37738(c14911, Boolean.TYPE);
        c15812.m37738(c14911, Boolean.class);
        c15812.m37738(c14165, Class.class);
        C12674 c12674 = C12674.f40598;
        c15812.m37738(c12674, char[].class);
        c15812.m37738(c12674, Object[].class);
        c15812.m37738(c14165, UUID.class);
        c15812.m37738(c14165, TimeZone.class);
        c15812.m37738(c14165, Locale.class);
        c15812.m37738(c14165, Currency.class);
        c15812.m37738(c14165, URI.class);
        c15812.m37738(c14165, URL.class);
        c15812.m37738(c14165, Pattern.class);
        c15812.m37738(c14165, Charset.class);
        c15812.m37738(c21780, Number.class);
        c15812.m37738(c14165, StackTraceElement.class);
        c15812.m37738(c11182, Serializable.class);
        c15812.m37738(c11182, Cloneable.class);
        c15812.m37738(c11182, Comparable.class);
        c15812.m37738(c11182, Closeable.class);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3725 m33061(Type type) {
        InterfaceC3725 interfaceC3725 = (InterfaceC3725) this.f42748.m37737(type);
        if (interfaceC3725 != null) {
            return interfaceC3725;
        }
        if (type instanceof Class) {
            return m33060((Class) type, type);
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return m33060((Class) rawType, type);
            }
            return m33061(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length == 1) {
                return m33061(upperBounds[0]);
            }
        }
        return C11182.f35253;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3725 m33060(Class cls, Type type) {
        InterfaceC3725 c5217;
        InterfaceC10216 interfaceC10216;
        Class clsMappingTo;
        C15812 c15812 = this.f42748;
        InterfaceC3725 interfaceC3725 = (InterfaceC3725) c15812.m37737(type);
        if (interfaceC3725 != null) {
            return interfaceC3725;
        }
        if (type == null) {
            type = cls;
        }
        InterfaceC3725 interfaceC3726 = (InterfaceC3725) c15812.m37737(type);
        if (interfaceC3726 != null) {
            return interfaceC3726;
        }
        if (!m33058(cls) && (interfaceC10216 = (InterfaceC10216) cls.getAnnotation(InterfaceC10216.class)) != null && (clsMappingTo = interfaceC10216.mappingTo()) != Void.class) {
            return m33060(clsMappingTo, clsMappingTo);
        }
        if ((type instanceof WildcardType) || (type instanceof TypeVariable) || (type instanceof ParameterizedType)) {
            interfaceC3726 = (InterfaceC3725) c15812.m37737(cls);
        }
        if (interfaceC3726 != null) {
            return interfaceC3726;
        }
        InterfaceC3725 interfaceC3727 = (InterfaceC3725) c15812.m37737(type);
        if (interfaceC3727 != null) {
            return interfaceC3727;
        }
        if (cls.isEnum()) {
            c5217 = new C8725(cls);
        } else if (cls.isArray()) {
            c5217 = C12674.f40598;
        } else {
            C21625 c21625 = C21625.f69049;
            if (cls == Set.class || cls == HashSet.class || cls == Collection.class || cls == List.class || cls == ArrayList.class || Collection.class.isAssignableFrom(cls)) {
                c5217 = c21625;
            } else if (Map.class.isAssignableFrom(cls)) {
                c5217 = C20133.f64697;
            } else if (Throwable.class.isAssignableFrom(cls)) {
                c5217 = new C25355(this, cls, cls);
            } else if (cls.getName().equals("android.net.Uri")) {
                c5217 = C14165.f44790;
            } else {
                c5217 = new C5217(this, cls, type);
            }
        }
        c15812.m37738(c5217, type);
        return c5217;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m33058(Class cls) {
        return cls.isPrimitive() || cls == Boolean.class || cls == Character.class || cls == Byte.class || cls == Short.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == BigInteger.class || cls == BigDecimal.class || cls == String.class || cls == Date.class || cls == java.sql.Date.class || cls == Time.class || cls == Timestamp.class;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Class m33059(String str, int i, Class cls) {
        if (str == null) {
            return null;
        }
        if (str.length() < 128) {
            if (str.length() >= 3) {
                long jCharAt = (((long) str.charAt(0)) ^ (-3750763034362895579L)) * 1099511628211L;
                if (jCharAt == -5808493101479473382L) {
                    throw new C4251("autoType is not support. ".concat(str));
                }
                if ((jCharAt ^ ((long) C22313.m50373(1, str))) * 1099511628211L == 655701488918567152L) {
                    throw new C4251("autoType is not support. ".concat(str));
                }
                long jCharAt2 = (((((((long) str.charAt(0)) ^ (-3750763034362895579L)) * 1099511628211L) ^ ((long) str.charAt(1))) * 1099511628211L) ^ ((long) str.charAt(2))) * 1099511628211L;
                for (int i2 = 3; i2 < str.length(); i2++) {
                    jCharAt2 = (jCharAt2 ^ ((long) str.charAt(i2))) * 1099511628211L;
                    if (Arrays.binarySearch(f42746, jCharAt2) >= 0 && C3134.m10230(str) == null) {
                        throw new C4251("autoType is not support. ".concat(str));
                    }
                }
                Class clsM10230 = C3134.m10230(str);
                if (clsM10230 != null) {
                    return clsM10230;
                }
                Class clsM37736 = this.f42748.m37736(str);
                if (clsM37736 != null) {
                    return clsM37736;
                }
                Class<?> clsM10244 = C3134.m10244(str);
                if (clsM10244 != null && cls != null && clsM10244 != HashMap.class) {
                    if (cls.isAssignableFrom(clsM10244)) {
                        C3134.m10224(clsM10244, str);
                        return clsM10244;
                    }
                    StringBuilder sbM51387 = C22783.m51387("type not match. ", str, " -> ");
                    sbM51387.append(cls.getName());
                    throw new C4251(sbM51387.toString());
                }
                if (clsM10244.isAnnotationPresent(InterfaceC10216.class)) {
                    C3134.m10224(clsM10244, str);
                    return clsM10244;
                }
                int i3 = EnumC7234.SupportAutoType.f23858;
                if ((i & i3) == 0 && (i3 & AbstractC12454.f40027) == 0) {
                    throw new C4251("autoType is not support : ".concat(str));
                }
                C3134.m10224(clsM10244, str);
                return clsM10244;
            }
        }
        throw new C4251("autoType is not support. ".concat(str));
    }
}
