package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.۟ܺۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AT0 */
/* JADX INFO: loaded from: classes4.dex */
public class C7998 extends C2777 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C7998 f26546 = new C7998();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ArrayList f26547;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public InterfaceC8743 f26548;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC8743 f26549;

    public C7998() {
        this.f9156 = -1;
    }

    public C7998(int i, C7998 c7998) {
        this.f9157 = c7998;
        this.f9156 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21806(InterfaceC19383 interfaceC19383) {
        if (this.f26547 == null) {
            this.f26547 = new ArrayList();
        }
        this.f26547.add(interfaceC19383);
    }

    @Override // l.C2777, l.InterfaceC19383
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC19383 mo9151(int i) {
        ArrayList arrayList = this.f26547;
        if (arrayList == null || i < 0 || i >= arrayList.size()) {
            return null;
        }
        return (InterfaceC19383) this.f26547.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7998 m21805(Class cls, int i) {
        ArrayList arrayList = this.f26547;
        InterfaceC19383 interfaceC19383 = null;
        if (arrayList != null && i >= 0 && i < arrayList.size()) {
            int i2 = -1;
            for (InterfaceC19383 interfaceC19384 : this.f26547) {
                if (cls.isInstance(interfaceC19384) && (i2 = i2 + 1) == i) {
                    interfaceC19383 = (InterfaceC19383) cls.cast(interfaceC19384);
                    break;
                }
            }
        }
        return (C7998) interfaceC19383;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1484 m21804(int i, int i2) {
        ArrayList arrayList = this.f26547;
        if (arrayList == null || i2 < 0 || i2 >= arrayList.size()) {
            return null;
        }
        int i3 = -1;
        for (InterfaceC19383 interfaceC19383 : this.f26547) {
            if (interfaceC19383 instanceof InterfaceC1484) {
                InterfaceC1484 interfaceC1484 = (InterfaceC1484) interfaceC19383;
                if (interfaceC1484.mo5285().getType() == i && (i3 = i3 + 1) == i2) {
                    return interfaceC1484;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m21807(int i) {
        ArrayList<InterfaceC19383> arrayList = this.f26547;
        if (arrayList == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = null;
        for (InterfaceC19383 interfaceC19383 : arrayList) {
            if (interfaceC19383 instanceof InterfaceC1484) {
                InterfaceC1484 interfaceC1484 = (InterfaceC1484) interfaceC19383;
                if (interfaceC1484.mo5285().getType() == i) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(interfaceC1484);
                }
            }
        }
        return arrayList2 == null ? Collections.EMPTY_LIST : arrayList2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m21803(Class cls) {
        ArrayList<InterfaceC19383> arrayList = this.f26547;
        if (arrayList == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = null;
        for (InterfaceC19383 interfaceC19383 : arrayList) {
            if (cls.isInstance(interfaceC19383)) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add((C7998) cls.cast(interfaceC19383));
            }
        }
        return arrayList2 == null ? Collections.EMPTY_LIST : arrayList2;
    }

    @Override // l.C2777, l.InterfaceC19383
    public final int getChildCount() {
        ArrayList arrayList = this.f26547;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }
}
