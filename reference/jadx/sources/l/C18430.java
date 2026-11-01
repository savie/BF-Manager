package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ᩴ֨ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5FW */
/* JADX INFO: loaded from: classes4.dex */
public final class C18430 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iM36534 = ((C7847) obj).f25806.m36534();
        int iM36535 = ((C7847) obj2).f25806.m36534();
        if (iM36534 < iM36535) {
            return -1;
        }
        return iM36534 > iM36535 ? 1 : 0;
    }
}
