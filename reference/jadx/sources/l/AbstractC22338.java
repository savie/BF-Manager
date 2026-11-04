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

/* JADX INFO: renamed from: l.᩷᩸ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22338 implements Serializable {
    public static final Map a;
    public static final long serialVersionUID = 8352817235686L;

    public abstract C21307 S();

    public abstract void W(DataOutput dataOutput);

    public abstract String getId();

    static {
        Map.Entry[] entryArr = {AbstractC1758.C("ACT", "Australia/Darwin"), AbstractC1758.C("AET", "Australia/Sydney"), AbstractC1758.C("AGT", "America/Argentina/Buenos_Aires"), AbstractC1758.C("ART", "Africa/Cairo"), AbstractC1758.C("AST", "America/Anchorage"), AbstractC1758.C("BET", "America/Sao_Paulo"), AbstractC1758.C("BST", "Asia/Dhaka"), AbstractC1758.C("CAT", "Africa/Harare"), AbstractC1758.C("CNT", "America/St_Johns"), AbstractC1758.C("CST", "America/Chicago"), AbstractC1758.C("CTT", "Asia/Shanghai"), AbstractC1758.C("EAT", "Africa/Addis_Ababa"), AbstractC1758.C("ECT", "Europe/Paris"), AbstractC1758.C("IET", "America/Indiana/Indianapolis"), AbstractC1758.C("IST", "Asia/Kolkata"), AbstractC1758.C("JST", "Asia/Tokyo"), AbstractC1758.C("MIT", "Pacific/Apia"), AbstractC1758.C("NET", "Asia/Yerevan"), AbstractC1758.C("NST", "Pacific/Auckland"), AbstractC1758.C("PLT", "Asia/Karachi"), AbstractC1758.C("PNT", "America/Phoenix"), AbstractC1758.C("PRT", "America/Puerto_Rico"), AbstractC1758.C("PST", "America/Los_Angeles"), AbstractC1758.C("SST", "Pacific/Guadalcanal"), AbstractC1758.C("VST", "Asia/Ho_Chi_Minh"), AbstractC1758.C("EST", "-05:00"), AbstractC1758.C("MST", "-07:00"), AbstractC1758.C("HST", "-10:00")};
        HashMap map = new HashMap(28);
        for (int i = 0; i < 28; i++) {
            Map.Entry entry = entryArr[i];
            Object objRequireNonNull = C17359.requireNonNull(entry.getKey());
            if (map.put(objRequireNonNull, C17359.requireNonNull(entry.getValue())) != null) {
                throw new IllegalArgumentException("duplicate key: " + objRequireNonNull);
            }
        }
        a = Collections.unmodifiableMap(map);
    }

    public static AbstractC22338 systemDefault() {
        String id = TimeZone.getDefault().getID();
        Map map = a;
        C17359.requireNonNull(id, "zoneId");
        C17359.requireNonNull(map, "aliasMap");
        return of((String) C17359.requireNonNullElse((String) map.get(id), id));
    }

    public static AbstractC22338 of(String str) {
        return T(str, true);
    }

    public static AbstractC22338 U(String str, C11149 c11149) {
        C17359.requireNonNull(str, "prefix");
        C17359.requireNonNull(c11149, "offset");
        if (str.isEmpty()) {
            return c11149;
        }
        if (!str.equals("GMT") && !str.equals(UtcDates.UTC) && !str.equals("UT")) {
            throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
        }
        if (c11149.getTotalSeconds() != 0) {
            str = str.concat(c11149.c);
        }
        return new C7947(str, c11149.S());
    }

    public static AbstractC22338 T(String str, boolean z) {
        C17359.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX) || str.startsWith("-")) {
            return C11149.Y(str);
        }
        if (str.startsWith(UtcDates.UTC) || str.startsWith("GMT")) {
            return V(str, 3, z);
        }
        if (str.startsWith("UT")) {
            return V(str, 2, z);
        }
        return C7947.X(str, z);
    }

    public static AbstractC22338 V(String str, int i, boolean z) {
        String strSubstring = str.substring(0, i);
        if (str.length() == i) {
            return U(strSubstring, C11149.f);
        }
        if (str.charAt(i) != '+' && str.charAt(i) != '-') {
            return C7947.X(str, z);
        }
        try {
            C11149 c11149Y = C11149.Y(str.substring(i));
            if (c11149Y == C11149.f) {
                return U(strSubstring, c11149Y);
            }
            return U(strSubstring, c11149Y);
        } catch (C21241 e) {
            throw new C21241("Invalid ID for offset-based ZoneId: ".concat(str), e);
        }
    }

    public static AbstractC22338 R(InterfaceC9437 interfaceC9437) {
        AbstractC22338 abstractC22338 = (AbstractC22338) interfaceC9437.P(AbstractC17577.e);
        if (abstractC22338 != null) {
            return abstractC22338;
        }
        throw new C21241("Unable to obtain ZoneId from TemporalAccessor: " + interfaceC9437 + " of type " + interfaceC9437.getClass().getName());
    }

    public AbstractC22338() {
        if (getClass() != C11149.class && getClass() != C7947.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC22338) {
            return getId().equals(((AbstractC22338) obj).getId());
        }
        return false;
    }

    public int hashCode() {
        return getId().hashCode();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public String toString() {
        return getId();
    }

    private Object writeReplace() {
        return new C21372((byte) 7, this);
    }
}
