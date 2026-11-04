package l;

import bin.mt.json.JSONArray;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.۠᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes3.dex */
public final class C8877 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f28999;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f29000;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f29001;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8877)) {
            return false;
        }
        C8877 c8877 = (C8877) obj;
        return this.f29001 == c8877.f29001 && this.f29000 == c8877.f29000 && C15243.m36589((Object) this.f28999, (Object) c8877.f28999);
    }

    public final int hashCode() {
        return this.f28999.hashCode() + (((this.f29001 * 31) + (this.f29000 ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkStorageInfo(id=");
        sb.append(this.f29001);
        sb.append(", isDir=");
        sb.append(this.f29000);
        sb.append(", backupTag=");
        return C8947.m23910(sb, this.f28999, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    public C8877(int i, String str, boolean z) {
        this.f29001 = i;
        this.f29000 = z;
        this.f28999 = str;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m23755() {
        return this.f29001;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m23754() {
        return this.f29000;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m23752() {
        return this.f28999;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C8877(AbstractC0148 abstractC0148, boolean z) {
        int i = abstractC0148.f1127;
        String strMo1325 = abstractC0148.mo1325();
        C15243.m36591(strMo1325, "getBackupTag(...)");
        this(i, strMo1325, z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C8877(JSONArray jSONArray) {
        int i = jSONArray.getInt(0);
        boolean z = jSONArray.getBoolean(1);
        String string = jSONArray.getString(2);
        C15243.m36591(string, "getString(...)");
        this(i, string, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8877 m23753(AbstractC0148 abstractC0148) {
        return new C8877(abstractC0148, this.f29000);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final JSONArray m23756() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(this.f29001);
        jSONArray.add(this.f29000);
        jSONArray.add(this.f28999);
        return jSONArray;
    }
}
