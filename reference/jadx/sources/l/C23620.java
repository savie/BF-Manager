package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹ܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75V0 */
/* JADX INFO: loaded from: classes.dex */
public final class C23620 implements InterfaceC14054 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C20636[] f76656;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f76657;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f76659;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f76655 = false;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C15634 f76658 = new C16160(this);

    public C23620(int i, HashMap map) {
        this.f76657 = i;
        this.f76659 = map;
        this.f76656 = new C20636[i];
    }

    @Override // l.InterfaceC14054
    /* JADX INFO: renamed from: ۙ */
    public final Object mo6602(Object obj, Object obj2, AbstractC12563 abstractC12563, AbstractC12563 abstractC12564) {
        ArrayList arrayList;
        C3482 c3482;
        C3482 c3483;
        C20636[] c20636Arr = (C20636[]) obj;
        C20636[] c20636Arr2 = (C20636[]) obj2;
        int i = this.f76657;
        if (c20636Arr2 == null) {
            c20636Arr2 = new C20636[i];
            System.arraycopy(c20636Arr, 0, c20636Arr2, 0, i);
        } else {
            for (int i2 = 0; i2 < i; i2++) {
                C20636 c20636 = c20636Arr[i2];
                C20636 c20637 = c20636Arr2[i2];
                if (c20636 != null) {
                    if (c20637 == null) {
                        c20636Arr2[i2] = c20636;
                    } else if (c20636 != c20637) {
                        C3482 c3484 = c20636.f66188;
                        if (c3484 != null) {
                            c3484.f12033 = true;
                        }
                        C3482 c3485 = c20637.f66188;
                        if (c3485 != null) {
                            c3485.f12033 = true;
                        }
                    }
                }
            }
        }
        if (abstractC12564.f40344 == EnumC20768.LABEL && (arrayList = ((C11817) abstractC12564).f38143) != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                for (AbstractC11071 abstractC11071 : ((C20022) it.next()).f12387.mo15448()) {
                    int i3 = ((C4448) abstractC11071).f15916;
                    C20636 c20638 = c20636Arr[i3];
                    C20636 c20639 = c20636Arr2[i3];
                    if (c20639 != null) {
                        if (!c20639.f66187 && (c3483 = c20639.f66188) != null) {
                            c3483.f12033 = true;
                        }
                    } else if (c20638 != null && !c20638.f66187 && (c3482 = c20638.f66188) != null) {
                        c3482.f12033 = true;
                    }
                }
            }
        }
        return c20636Arr2;
    }

    @Override // l.InterfaceC14054
    /* JADX INFO: renamed from: ۙ */
    public final Object mo13332(Object obj, AbstractC12563 abstractC12563) {
        this.f76655 = false;
        int i = this.f76657;
        C20636[] c20636Arr = this.f76656;
        System.arraycopy((C20636[]) obj, 0, c20636Arr, 0, i);
        this.f76658.mo37387(abstractC12563);
        if (abstractC12563.f40345.size() > 1) {
            this.f76655 = true;
        }
        if (!this.f76655) {
            abstractC12563.f40353 = null;
        }
        return c20636Arr;
    }

    @Override // l.InterfaceC14054
    /* JADX INFO: renamed from: ۙ */
    public final Object mo13331() {
        return new C20636[this.f76657];
    }
}
