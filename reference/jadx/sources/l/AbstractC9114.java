package l;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.datepicker.UtcDates;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.ۡ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9114 implements Serializable {
    public static final Map a;
    public static final long serialVersionUID = 8352817235686L;

    public abstract C15380 W();

    public abstract void a0(DataOutput dataOutput);

    public abstract String k();

    static {
        Map.Entry[] entryArr = {AbstractC1726.C("ACT", "Australia/Darwin"), AbstractC1726.C("AET", "Australia/Sydney"), AbstractC1726.C("AGT", "America/Argentina/Buenos_Aires"), AbstractC1726.C("ART", "Africa/Cairo"), AbstractC1726.C("AST", "America/Anchorage"), AbstractC1726.C("BET", "America/Sao_Paulo"), AbstractC1726.C("BST", "Asia/Dhaka"), AbstractC1726.C("CAT", "Africa/Harare"), AbstractC1726.C("CNT", "America/St_Johns"), AbstractC1726.C("CST", "America/Chicago"), AbstractC1726.C("CTT", "Asia/Shanghai"), AbstractC1726.C("EAT", "Africa/Addis_Ababa"), AbstractC1726.C("ECT", "Europe/Paris"), AbstractC1726.C("IET", "America/Indiana/Indianapolis"), AbstractC1726.C("IST", "Asia/Kolkata"), AbstractC1726.C("JST", "Asia/Tokyo"), AbstractC1726.C("MIT", "Pacific/Apia"), AbstractC1726.C("NET", "Asia/Yerevan"), AbstractC1726.C("NST", "Pacific/Auckland"), AbstractC1726.C("PLT", "Asia/Karachi"), AbstractC1726.C("PNT", "America/Phoenix"), AbstractC1726.C("PRT", "America/Puerto_Rico"), AbstractC1726.C("PST", "America/Los_Angeles"), AbstractC1726.C("SST", "Pacific/Guadalcanal"), AbstractC1726.C("VST", "Asia/Ho_Chi_Minh"), AbstractC1726.C("EST", "-05:00"), AbstractC1726.C("MST", "-07:00"), AbstractC1726.C("HST", "-10:00")};
        HashMap map = new HashMap(28);
        for (int i = 0; i < 28; i++) {
            Map.Entry entry = entryArr[i];
            Object objRequireNonNull = C13638.requireNonNull(entry.getKey());
            if (map.put(objRequireNonNull, C13638.requireNonNull(entry.getValue())) != null) {
                throw new IllegalArgumentException("duplicate key: " + objRequireNonNull);
            }
        }
        a = Collections.unmodifiableMap(map);
    }

    public static AbstractC9114 systemDefault() {
        String id = TimeZone.getDefault().getID();
        Map map = a;
        C13638.requireNonNull(id, "zoneId");
        C13638.requireNonNull(map, "aliasMap");
        return X((String) C13638.requireNonNullElse((String) map.get(id), id), true);
    }

    public static AbstractC9114 Y(String str, C2678 c2678) {
        C13638.requireNonNull(str, "prefix");
        C13638.requireNonNull(c2678, "offset");
        if (str.isEmpty()) {
            return c2678;
        }
        if (!str.equals("GMT") && !str.equals(UtcDates.UTC) && !str.equals("UT")) {
            throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
        }
        if (c2678.b != 0) {
            str = str.concat(c2678.c);
        }
        return new C5501(str, c2678.W());
    }

    public static AbstractC9114 X(String str, boolean z) {
        C13638.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX) || str.startsWith("-")) {
            return C2678.c0(str);
        }
        if (str.startsWith(UtcDates.UTC) || str.startsWith("GMT")) {
            return Z(str, 3, z);
        }
        if (str.startsWith("UT")) {
            return Z(str, 2, z);
        }
        return C5501.b0(str, z);
    }

    public static AbstractC9114 Z(String str, int i, boolean z) {
        String strSubstring = str.substring(0, i);
        if (str.length() == i) {
            return Y(strSubstring, C2678.f);
        }
        if (str.charAt(i) != '+' && str.charAt(i) != '-') {
            return C5501.b0(str, z);
        }
        try {
            C2678 c2678C0 = C2678.c0(str.substring(i));
            if (c2678C0 == C2678.f) {
                return Y(strSubstring, c2678C0);
            }
            return Y(strSubstring, c2678C0);
        } catch (C15464 e) {
            throw new C15464("Invalid ID for offset-based ZoneId: ".concat(str), e);
        }
    }

    public static AbstractC9114 V(InterfaceC21584 interfaceC21584) {
        AbstractC9114 abstractC9114 = (AbstractC9114) interfaceC21584.T(AbstractC23702.e);
        if (abstractC9114 != null) {
            return abstractC9114;
        }
        throw new C15464("Unable to obtain ZoneId from TemporalAccessor: " + interfaceC21584 + " of type " + interfaceC21584.getClass().getName());
    }

    public AbstractC9114() {
        if (getClass() != C2678.class && getClass() != C5501.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC9114) {
            return k().equals(((AbstractC9114) obj).k());
        }
        return false;
    }

    public int hashCode() {
        return k().hashCode();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public String toString() {
        return k();
    }

    private Object writeReplace() {
        return new C3944((byte) 7, this);
    }
}
