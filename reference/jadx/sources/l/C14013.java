package l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܰᩴ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes4.dex */
public class C14013 implements InterfaceC23869 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4839 f46052;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Class f46053;

    public C14013(Class cls, Class cls2, String str) {
        C4839 c4839 = new C4839(cls, cls2, str);
        this.f46053 = c4839.f16998.getReturnType();
        this.f46052 = c4839;
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ۙ */
    public Object mo8303(AbstractC18245 abstractC18245) {
        return this.f46052.m13425(abstractC18245);
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ܰ */
    public Object mo8304(AbstractC0584 abstractC0584) {
        return this.f46052.m13431(abstractC0584);
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ۨ */
    public final Object mo32796(AbstractC18245 abstractC18245) {
        return mo8303(abstractC18245);
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ۙ */
    public final void mo4666(AbstractC0584 abstractC0584, Object obj) {
        mo33881(abstractC0584);
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            mo10108(abstractC0584, it.next());
        }
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ۙ */
    public Object mo10105(int i, AbstractC18245 abstractC18245) {
        return this.f46052.m13423(i, abstractC18245);
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ܰ */
    public Object mo10107(AbstractC0584 abstractC0584, int i) {
        return this.f46052.m13424(abstractC0584, i);
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ۙ */
    public void mo10106(AbstractC0584 abstractC0584, int i, Object obj) {
        this.f46052.m13427(abstractC0584, i, obj);
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ܰ */
    public void mo10108(AbstractC0584 abstractC0584, Object obj) {
        this.f46052.m13428(abstractC0584, obj);
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo33884(AbstractC18245 abstractC18245) {
        throw new UnsupportedOperationException("hasField() called on a repeated field.");
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean mo33883(AbstractC0584 abstractC0584) {
        throw new UnsupportedOperationException("hasField() called on a repeated field.");
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int mo33880(AbstractC18245 abstractC18245) {
        return this.f46052.m13430(abstractC18245);
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int mo33882(AbstractC0584 abstractC0584) {
        return this.f46052.m13429(abstractC0584);
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo33881(AbstractC0584 abstractC0584) {
        this.f46052.m13426(abstractC0584);
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC22500 mo4665() {
        throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ۖ */
    public final InterfaceC22500 mo4664(AbstractC0584 abstractC0584) {
        throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC22500 mo29658(AbstractC0584 abstractC0584, int i) {
        throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
    }
}
