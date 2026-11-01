package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩺᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AT0 */
/* JADX INFO: loaded from: classes.dex */
public class C23289 extends C8472 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C23289 f75535 = new C23289();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC19761 f75536;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public InterfaceC19761 f75537;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ArrayList f75538;

    public C23289() {
        this.f29377 = -1;
    }

    public C23289(int i, C23289 c23289) {
        this.f29378 = c23289;
        this.f29377 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51375(InterfaceC14988 interfaceC14988) {
        if (this.f75538 == null) {
            this.f75538 = new ArrayList();
        }
        this.f75538.add(interfaceC14988);
    }

    @Override // l.C8472, l.InterfaceC14988
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC14988 mo22136(int i) {
        ArrayList arrayList = this.f75538;
        if (arrayList == null || i < 0 || i >= arrayList.size()) {
            return null;
        }
        return (InterfaceC14988) this.f75538.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23289 m51374(Class cls, int i) {
        ArrayList arrayList = this.f75538;
        InterfaceC14988 interfaceC14988 = null;
        if (arrayList != null && i >= 0 && i < arrayList.size()) {
            int i2 = -1;
            for (InterfaceC14988 interfaceC14989 : this.f75538) {
                if (cls.isInstance(interfaceC14989) && (i2 = i2 + 1) == i) {
                    interfaceC14988 = (InterfaceC14988) cls.cast(interfaceC14989);
                    break;
                }
            }
        }
        return (C23289) interfaceC14988;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17809 m51373(int i, int i2) {
        ArrayList arrayList = this.f75538;
        if (arrayList == null || i2 < 0 || i2 >= arrayList.size()) {
            return null;
        }
        int i3 = -1;
        for (InterfaceC14988 interfaceC14988 : this.f75538) {
            if (interfaceC14988 instanceof InterfaceC17809) {
                InterfaceC17809 interfaceC17809 = (InterfaceC17809) interfaceC14988;
                if (interfaceC17809.mo41396().getType() == i && (i3 = i3 + 1) == i2) {
                    return interfaceC17809;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List m51376(int i) {
        ArrayList<InterfaceC14988> arrayList = this.f75538;
        if (arrayList == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = null;
        for (InterfaceC14988 interfaceC14988 : arrayList) {
            if (interfaceC14988 instanceof InterfaceC17809) {
                InterfaceC17809 interfaceC17809 = (InterfaceC17809) interfaceC14988;
                if (interfaceC17809.mo41396().getType() == i) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(interfaceC17809);
                }
            }
        }
        return arrayList2 == null ? Collections.EMPTY_LIST : arrayList2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m51372(Class cls) {
        ArrayList<InterfaceC14988> arrayList = this.f75538;
        if (arrayList == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = null;
        for (InterfaceC14988 interfaceC14988 : arrayList) {
            if (cls.isInstance(interfaceC14988)) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add((C23289) cls.cast(interfaceC14988));
            }
        }
        return arrayList2 == null ? Collections.EMPTY_LIST : arrayList2;
    }

    @Override // l.C8472, l.InterfaceC14988
    public final int getChildCount() {
        ArrayList arrayList = this.f75538;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }
}
