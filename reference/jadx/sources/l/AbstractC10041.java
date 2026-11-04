package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: PBEP */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10041 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0347 f32176;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C24960 f32177;

    public AbstractC10041(C24960 c24960, C0347 c0347) {
        this.f32177 = c24960;
        this.f32176 = c0347;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20946 m25893(AbstractC5568 abstractC5568, C20946 c20946) {
        C0347 c0347;
        C19738 c19738M16506 = abstractC5568.m16506();
        ArrayList arrayListM45460 = c19738M16506.m45460();
        int iIndexOf = arrayListM45460.indexOf(abstractC5568);
        if (iIndexOf < 0) {
            throw new IllegalArgumentException("specified insn is not in this block");
        }
        if (iIndexOf != arrayListM45460.size() - 1) {
            throw new IllegalArgumentException("Adding move here not supported:" + abstractC5568.mo1843());
        }
        C24960 c24960 = this.f32177;
        C20946 c20946M47883 = C20946.m47883(c24960.m55744(), c20946.m47898());
        arrayListM45460.add(iIndexOf, AbstractC5568.m16501(new C23930(C0809.m3258(c20946M47883.getType()), C9012.f29360, c20946M47883, C0063.m1033(c20946)), c19738M16506));
        int iM47903 = c20946M47883.m47903();
        InterfaceC11271 it = c19738M16506.m45476().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c0347 = this.f32176;
            if (!zHasNext) {
                break;
            }
            c0347.m2092(iM47903, it.next());
        }
        C0063 c0063Mo4992 = abstractC5568.mo4992();
        int size = c0063Mo4992.size();
        for (int i = 0; i < size; i++) {
            c0347.m2092(iM47903, c0063Mo4992.m31619get(i).m47903());
        }
        c24960.m55745();
        return c20946M47883;
    }
}
