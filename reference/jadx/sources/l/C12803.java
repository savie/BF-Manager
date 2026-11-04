package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫ۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: F5QL */
/* JADX INFO: loaded from: classes4.dex */
public final class C12803 extends AbstractC10739 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public byte[] f41017;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public AbstractC10739[] f41018;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f41019;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C7033 f41020;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C3282[] f41021;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C12803 c12803 = (C12803) obj;
        C7033 c7033 = this.f41020;
        if (c7033 == null) {
            return c12803.f41020 == null ? 0 : -1;
        }
        C7033 c7034 = c12803.f41020;
        if (c7034 == null) {
            return 1;
        }
        return c7033.compareTo(c7034);
    }

    public C12803(C24738 c24738) {
        super(c24738);
        this.f41020 = null;
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final void mo10825(C4028 c4028, C17452 c17452) {
        AbstractC10739 abstractC10739M49623;
        this.f41019 = c4028.m12998();
        this.f41021 = new C3282[c4028.m12998()];
        C21928 c21928 = this.f34102.f80094;
        int i = 0;
        while (true) {
            C3282[] c3282Arr = this.f41021;
            if (i < c3282Arr.length) {
                int iM12998 = c4028.m12998() - 1;
                if (iM12998 == -1) {
                    c21928.getClass();
                    abstractC10739M49623 = null;
                } else {
                    abstractC10739M49623 = c21928.m49623(iM12998);
                }
                c3282Arr[i] = (C3282) abstractC10739M49623;
                i++;
            } else {
                int iM12992 = c4028.m12992();
                ArrayList arrayList = new ArrayList(50);
                C4600.m14407(c4028, new C10565(this, arrayList));
                AbstractC10739[] abstractC10739Arr = new AbstractC10739[arrayList.size()];
                this.f41018 = abstractC10739Arr;
                arrayList.toArray(abstractC10739Arr);
                int iM12993 = c4028.m12992() - iM12992;
                c4028.m12996(iM12992);
                this.f41017 = c4028.m13001(iM12993);
                return;
            }
        }
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final int mo10821(int i) {
        int iM19213 = C6929.m19213(this.f41021.length) + C6929.m19213(this.f41019) + i;
        C3282[] c3282Arr = this.f41021;
        int length = c3282Arr.length;
        for (int i2 = 0; i2 < length; i2++) {
            C3282 c3282 = c3282Arr[i2];
            iM19213 += C6929.m19213(c3282 == null ? 0 : c3282.f34104 + 1);
        }
        C4028 c4028 = new C4028(this.f41017);
        C19516 c19516 = new C19516(this);
        C4600.m14407(c4028, c19516);
        return iM19213 + c19516.f72797;
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final void mo10826(C24166 c24166) {
        c24166.m54135(this.f41019);
        c24166.m54135(this.f41021.length);
        C3282[] c3282Arr = this.f41021;
        int length = c3282Arr.length;
        for (int i = 0; i < length; i++) {
            C3282 c3282 = c3282Arr[i];
            c24166.m54135(c3282 == null ? 0 : c3282.f34104 + 1);
        }
        C4600.m14407(new C4028(this.f41017), new C15040(this, c24166));
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final String mo10823() {
        return C4791.m14766(new StringBuilder("debug_info_item @0x"), this.f34103);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31754(C7033 c7033) {
        this.f41020 = c7033;
    }
}
