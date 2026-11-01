package l;

import android.content.pm.ShortcutManager;
import java.io.InputStream;
import net.sf.sevenzipjbinding.NativeXZInputStream;

/* JADX INFO: renamed from: l.ۚ֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: QB6R */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5038 implements InterfaceC7359, InterfaceC11955, InterfaceC3740, InterfaceC19534 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f17603;

    public /* synthetic */ C5038(int i) {
        this.f17603 = i;
    }

    public /* synthetic */ C5038(C19602 c19602, int i) {
        this.f17603 = 3;
    }

    public /* synthetic */ C5038(C19602 c19602, C18627 c18627) {
        this.f17603 = 4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ Class m14057() {
        return ShortcutManager.class;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m14058(long j) {
        if (j == 0) {
            return "0";
        }
        if (j > 0) {
            return Long.toString(j, 16);
        }
        int i = 64;
        char[] cArr = new char[64];
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(16);
        do {
            i--;
            cArr[i] = Character.forDigit(((int) j) & 15, 16);
            j >>>= iNumberOfTrailingZeros;
        } while (j != 0);
        return new String(cArr, i, 64 - i);
    }

    @Override // l.InterfaceC19534
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InputStream mo14059(InputStream inputStream) {
        return new NativeXZInputStream(inputStream);
    }

    @Override // l.InterfaceC11955
    public Object apply(Object obj) {
        return ((InterfaceC6806) obj).mo7675().m52137();
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        InterfaceC10430 interfaceC10430 = (InterfaceC10430) obj;
        switch (this.f17603) {
            case 3:
                interfaceC10430.getClass();
                break;
            default:
                interfaceC10430.getClass();
                break;
        }
    }

    @Override // l.InterfaceC3740
    /* JADX INFO: renamed from: ܰ */
    public Object mo1620() {
        return new ConcurrentMapC13783();
    }
}
