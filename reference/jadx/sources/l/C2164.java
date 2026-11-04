package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫᩶ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8XW */
/* JADX INFO: loaded from: classes3.dex */
public final class C2164 extends AbstractC9008 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9532 f7137 = new C9532();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f7138 = new ArrayList();

    @Override // l.InterfaceC8263
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC23705 mo7447() {
        return this.f7137;
    }

    @Override // l.InterfaceC8263
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7932 mo7444(InterfaceC4753 interfaceC4753) {
        if (interfaceC4753.mo14650() >= 4) {
            return new C7932(-1, interfaceC4753.mo14651() + 4, false);
        }
        if (interfaceC4753.mo14653()) {
            return C7932.m21504(interfaceC4753.mo14654());
        }
        return null;
    }

    @Override // l.AbstractC9008, l.InterfaceC8263
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7445(C14228 c14228) {
        this.f7138.add(c14228.m34537());
    }

    @Override // l.AbstractC9008, l.InterfaceC8263
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo7446() {
        int i;
        CharSequence charSequence;
        ArrayList arrayList = this.f7138;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                break;
            } else {
                charSequence = (CharSequence) arrayList.get(size);
            }
        } while (C6790.m18956(0, charSequence.length(), charSequence) == charSequence.length());
        StringBuilder sb = new StringBuilder();
        for (i = 0; i < size + 1; i++) {
            sb.append((CharSequence) arrayList.get(i));
            sb.append('\n');
        }
        this.f7137.m24946(sb.toString());
    }
}
