package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes2.dex */
public final class C4590 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ArrayList f16251;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f16252;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f16253;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f16254;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1727 f16255;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ArrayList f16256;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumC23601 f16257;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f16258;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f16259;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final HashSet f16260;

    public C4590(C9490 c9490) {
        this.f16254 = C8057.m21188(c9490.f32098, c9490.f32101);
        InterfaceC1727 interfaceC1727M24308 = C9490.m24308(c9490);
        this.f16255 = interfaceC1727M24308;
        this.f16256 = c9490.f32105;
        ArrayList arrayList = c9490.f32099;
        this.f16252 = arrayList;
        ArrayList arrayList2 = c9490.f32103;
        this.f16259 = arrayList2;
        ArrayList arrayList3 = c9490.f32102;
        this.f16251 = arrayList3;
        HashSet hashSet = c9490.f32095;
        this.f16260 = hashSet;
        this.f16257 = c9490.f32096;
        this.f16253 = c9490.f32100;
        int i = c9490.f32097;
        this.f16258 = i;
        interfaceC1727M24308.mo1699(new C16524(arrayList, arrayList2, arrayList3, hashSet, i, new C22874(0)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC19367 m12737(String str) {
        C13638.requireNonNull(str, "input must not be null");
        AbstractC19367 abstractC19367M21198 = new C8057(this.f16254, this.f16255, this.f16252, this.f16259, this.f16251, this.f16260, this.f16257, this.f16253, this.f16258).m21198(str);
        Iterator it = this.f16256.iterator();
        while (it.hasNext()) {
            abstractC19367M21198 = ((InterfaceC13764) it.next()).mo7341(abstractC19367M21198);
        }
        return abstractC19367M21198;
    }
}
