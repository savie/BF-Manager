package l;

import bin.mt.plus.R;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ܳۗۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5GB */
/* JADX INFO: loaded from: classes5.dex */
public final class C15059 extends C6702 implements InterfaceC13413 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractC1928 f49167;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f49168;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6163 f49166 = new C14158();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC5417 f49165 = new C4619();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Iterable m36255(Object obj) {
        InterfaceC7140 interfaceC7140 = ((C5122) obj).f17841;
        if (interfaceC7140 == null) {
            return null;
        }
        return interfaceC7140.mo2842();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SortedSet m36256(Comparable comparable) {
        return ((C7447) comparable).f24510;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Set m36257(Object obj) {
        return ((C5122) obj).f17837;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C10628 m36258(Object obj) {
        InterfaceC7140 interfaceC7140 = ((C5122) obj).f17841;
        if (interfaceC7140 instanceof C10628) {
            return (C10628) interfaceC7140;
        }
        return new C10628(interfaceC7140);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m36259(Comparable comparable) {
        return ((C7447) comparable).f24513;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Map.Entry m36260(CharSequence charSequence) {
        C21530 c21530 = (C21530) charSequence;
        if (c21530 == null) {
            return null;
        }
        C7447 c7447 = (C7447) this.f49168.get(c21530.f68791.f12443);
        if (c7447 == null) {
            return null;
        }
        return new C21773(c7447);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36261(int i, Comparable comparable) {
        ((C7447) comparable).f24516 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36262(int i, Object obj) {
        ((C5122) obj).f17842 = i;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m36264(Object obj) {
        return ((C5122) obj).f17835;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Collection m36265(Comparable comparable) {
        C7447 c7447 = (C7447) comparable;
        c7447.getClass();
        return new C8938(c7447);
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int m36266(Object obj) {
        InterfaceC7140 interfaceC7140 = ((C5122) obj).f17841;
        if (interfaceC7140 == null) {
            return 0;
        }
        return interfaceC7140.mo2841();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C18634 m36268(Comparable comparable) {
        C7447 c7447 = (C7447) comparable;
        if (c7447.f24514.isEmpty()) {
            return null;
        }
        return c7447.f24514;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m36269(Object obj) {
        return ((C9838) obj).f31667;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC5439 m36270(Comparable comparable) {
        return ((C7447) comparable).f24512;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Iterable m36271(Object obj) {
        return C16625.m39330(((C5122) obj).f17836, new C22519());
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m36272(Object obj) {
        return ((C5122) obj).f17842;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final SortedSet m36273(Comparable comparable) {
        return ((C7447) comparable).f24515;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Collection m36274(Comparable comparable) {
        C7447 c7447 = (C7447) comparable;
        c7447.getClass();
        return new C2972(c7447);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m36275(Object obj) {
        return ((C5122) obj).f17839;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C21530 m36276(Comparable comparable) {
        return ((C7447) comparable).f24507;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Set m36277(Object obj) {
        return ((C9838) obj).f31665;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C11330 m36278(Comparable comparable) {
        return ((C7447) comparable).f24506;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Iterable m36279(Object obj) {
        InterfaceC7140 interfaceC7140 = ((C5122) obj).f17841;
        if (interfaceC7140 == null) {
            return null;
        }
        return interfaceC7140.mo2840();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21530 m36280(Comparable comparable) {
        return ((C7447) comparable).f24509;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC5439 m36281(Comparable comparable) {
        return ((C7447) comparable).f24508;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final List m36282(Object obj) {
        List list = ((C5122) obj).f17836;
        if (C16625.m39333(list, f49166)) {
            return new C10584(list);
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m36283(Comparable comparable) {
        return ((C7447) comparable).f24516;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m36284(int i, Object obj) {
        ((C5122) obj).f17835 = i;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C20784 m36286(Comparable comparable) {
        return ((C7447) comparable).f24511;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C18634 m36287(Object obj) {
        C5122 c5122 = (C5122) obj;
        if (c5122.f17840.isEmpty()) {
            return null;
        }
        return c5122.f17840;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final List m36288(Object obj) {
        InterfaceC7140 interfaceC7140 = ((C5122) obj).f17841;
        if (interfaceC7140 == null) {
            return AbstractC1928.of();
        }
        return interfaceC7140.mo2839();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C3630 m36289(Comparable comparable) {
        return ((C7447) comparable).f24505;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C18634 m36290(Object obj) {
        C9838 c9838 = (C9838) obj;
        if (c9838.f31669.isEmpty()) {
            return null;
        }
        return c9838.f31669;
    }

    public C15059(C8850 c8850) {
        super(c8850);
        this.f49168 = new ConcurrentMapC17249();
        this.f49167 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36263(C7447 c7447) {
        if (((C7447) this.f49168.put(c7447.getType(), c7447)) != null) {
            throw new C23044(null, C21576.m49059(R.string.MT_Protector, c7447.getType()), new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 m36285() {
        if (this.f49167 == null) {
            AbstractC18753 abstractC18753M43550 = AbstractC18753.m43550();
            Collection collectionValues = this.f49168.values();
            abstractC18753M43550.getClass();
            this.f49167 = AbstractC1928.m6613(abstractC18753M43550, collectionValues);
        }
        return this.f49167;
    }

    @Override // l.InterfaceC13413
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo5271() {
        return new C19535(this.f49168.values());
    }

    @Override // l.InterfaceC13413
    public final int getItemCount() {
        return this.f49168.size();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 m36267() {
        return this.f49168;
    }
}
