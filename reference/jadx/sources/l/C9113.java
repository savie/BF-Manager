package l;

import bin.mt.json.JSON;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۡۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06Y2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9113 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f29598;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List f29599;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List f29600;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f29601;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f29602;

    public C9113(String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        C17359.requireNonNull(str, "homePath");
        this.f29601 = str;
        C17359.requireNonNull(str2, "policyRevision");
        this.f29602 = str2;
        C0911.m3681(arrayList);
        ArrayList<C0911> arrayList3 = new ArrayList(arrayList);
        this.f29600 = C4681.unmodifiableList(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.sort(arrayList4);
        this.f29599 = C4681.unmodifiableList(arrayList4);
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList5.add(str);
        for (C0911 c0911 : arrayList3) {
            if (c0911.f3414 && c0911.f3415 == EnumC20059.DIRECTORY) {
                arrayList5.add(c0911.f3413);
            }
        }
        Collections.sort(arrayList5);
        this.f29598 = C4681.unmodifiableList(arrayList5);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9859 m24267(String str) {
        Iterator it = this.f29599.iterator();
        while (it.hasNext()) {
            if (C0470.m2302(str, (String) it.next())) {
                return new C9859(str, EnumC7623.DENY, EnumC18810.MANAGED_PATH);
            }
        }
        if (C0470.m2301(str)) {
            return m24266(str, EnumC18810.ANDROID_DATA);
        }
        if (C0470.m2302(str, this.f29601)) {
            return new C9859(str, EnumC7623.READ_WRITE, EnumC18810.HOME);
        }
        return m24266(str, EnumC18810.DEFAULT);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m24268(String str) throws C10186 {
        if (!m24267(str).f31730.m20826()) {
            throw C10186.m26306("FILE_ACCESS_DENIED", "Read access is denied by the MCP file policy.", "fatal", null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str).add("policyRevision", this.f29602));
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m24270(String str) throws C10186 {
        if (!m24267(str).f31730.m20828()) {
            throw C10186.m26306("FILE_ACCESS_DENIED", "Write access is denied by the MCP file policy.", "fatal", null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str).add("policyRevision", this.f29602));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m24269(String str) throws C10186 {
        Iterator it = this.f29598.iterator();
        while (it.hasNext()) {
            if (C0470.m2302((String) it.next(), str)) {
                throw C10186.m26306("FILE_ACCESS_ROOT_PROTECTED", "The operation would modify an MCP file access root.", "fatal", null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str).add("policyRevision", this.f29602));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C9859 m24266(String str, EnumC18810 enumC18810) {
        boolean zEquals;
        for (C0911 c0911 : this.f29600) {
            boolean zM3682 = c0911.m3682();
            String str2 = c0911.f3413;
            EnumC7623 enumC7623 = c0911.f3412;
            if (zM3682) {
                return new C9859(str, enumC7623, enumC18810);
            }
            if (c0911.f3414) {
                if (c0911.f3415 == EnumC20059.DIRECTORY) {
                    zEquals = C0470.m2302(str, str2);
                } else {
                    zEquals = str.equals(str2);
                }
                if (zEquals) {
                    return new C9859(str, enumC7623, EnumC18810.RULE);
                }
            }
        }
        throw new IllegalStateException("Root rule is missing");
    }
}
