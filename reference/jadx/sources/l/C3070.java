package l;

import bin.mt.json.JSON;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۗۜ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 06Y2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3070 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f11560;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f11561;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final List f11562;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List f11563;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f11564;

    public C3070(String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        C13638.requireNonNull(str, "homePath");
        this.f11564 = str;
        C13638.requireNonNull(str2, "policyRevision");
        this.f11560 = str2;
        C9422.m24179(arrayList);
        ArrayList<C9422> arrayList3 = new ArrayList(arrayList);
        this.f11562 = C0561.unmodifiableList(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.sort(arrayList4);
        this.f11563 = C0561.unmodifiableList(arrayList4);
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList5.add(str);
        for (C9422 c9422 : arrayList3) {
            if (c9422.f31926 && c9422.f31923 == EnumC13197.DIRECTORY) {
                arrayList5.add(c9422.f31925);
            }
        }
        Collections.sort(arrayList5);
        this.f11561 = C0561.unmodifiableList(arrayList5);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1659 m9208(String str) {
        Iterator it = this.f11563.iterator();
        while (it.hasNext()) {
            if (C6370.m17477(str, (String) it.next())) {
                return new C1659(str, EnumC23533.DENY, EnumC14361.MANAGED_PATH);
            }
        }
        if (C6370.m17476(str)) {
            return m9206(str, EnumC14361.ANDROID_DATA);
        }
        if (C6370.m17477(str, this.f11564)) {
            return new C1659(str, EnumC23533.READ_WRITE, EnumC14361.HOME);
        }
        return m9206(str, EnumC14361.DEFAULT);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m9209(String str) {
        if (!m9208(str).f6625.m51848()) {
            throw C12731.m31631("FILE_ACCESS_DENIED", "Read access is denied by the MCP file policy.", "fatal", null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str).add("policyRevision", this.f11560));
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m9207(String str) throws C12731 {
        if (!m9208(str).f6625.m51850()) {
            throw C12731.m31631("FILE_ACCESS_DENIED", "Write access is denied by the MCP file policy.", "fatal", null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str).add("policyRevision", this.f11560));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m9210(String str) throws C12731 {
        Iterator it = this.f11561.iterator();
        while (it.hasNext()) {
            if (C6370.m17477((String) it.next(), str)) {
                throw C12731.m31631("FILE_ACCESS_ROOT_PROTECTED", "The operation would modify an MCP file access root.", "fatal", null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str).add("policyRevision", this.f11560));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C1659 m9206(String str, EnumC14361 enumC14361) {
        boolean zEquals;
        for (C9422 c9422 : this.f11562) {
            boolean zM24180 = c9422.m24180();
            String str2 = c9422.f31925;
            EnumC23533 enumC23533 = c9422.f31924;
            if (zM24180) {
                return new C1659(str, enumC23533, enumC14361);
            }
            if (c9422.f31926) {
                if (c9422.f31923 == EnumC13197.DIRECTORY) {
                    zEquals = C6370.m17477(str, str2);
                } else {
                    zEquals = str.equals(str2);
                }
                if (zEquals) {
                    return new C1659(str, enumC23533, EnumC14361.RULE);
                }
            }
        }
        throw new IllegalStateException("Root rule is missing");
    }
}
