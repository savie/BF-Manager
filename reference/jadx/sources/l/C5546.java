package l;

import bin.mt.json.JSONArray;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۚᩴ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes2.dex */
public final class C5546 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f19017;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f19018;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f19019;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5546)) {
            return false;
        }
        C5546 c5546 = (C5546) obj;
        return this.f19019 == c5546.f19019 && this.f19018 == c5546.f19018 && C13465.m32965((Object) this.f19017, (Object) c5546.f19017);
    }

    public final int hashCode() {
        return this.f19017.hashCode() + (((this.f19019 * 31) + (this.f19018 ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkStorageInfo(id=");
        sb.append(this.f19019);
        sb.append(", isDir=");
        sb.append(this.f19018);
        sb.append(", backupTag=");
        return C22697.m50267(sb, this.f19017, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    public C5546(int i, String str, boolean z) {
        this.f19019 = i;
        this.f19018 = z;
        this.f19017 = str;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m15296() {
        return this.f19019;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m15295() {
        return this.f19018;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m15293() {
        return this.f19017;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5546(AbstractC12068 abstractC12068, boolean z) {
        int i = abstractC12068.f40385;
        String strMo4700 = abstractC12068.mo4700();
        C13465.m32967(strMo4700, "getBackupTag(...)");
        this(i, strMo4700, z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5546(JSONArray jSONArray) {
        int i = jSONArray.getInt(0);
        boolean z = jSONArray.getBoolean(1);
        String string = jSONArray.getString(2);
        C13465.m32967(string, "getString(...)");
        this(i, string, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5546 m15294(AbstractC12068 abstractC12068) {
        return new C5546(abstractC12068, this.f19018);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final JSONArray m15292() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(this.f19019);
        jSONArray.add(this.f19018);
        jSONArray.add(this.f19017);
        return jSONArray;
    }
}
