package l;

import android.view.MenuItem;
import java.io.BufferedOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.۫ۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45G7 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12388 implements InterfaceC20544, InterfaceC21133, InterfaceC21921, InterfaceC7034 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f41401;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f41402;

    public /* synthetic */ C12388(int i, Object obj) {
        this.f41401 = i;
        this.f41402 = obj;
    }

    @Override // l.InterfaceC21133
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.f41401) {
            case 1:
                C8286.m21704((C8286) this.f41402, menuItem);
                return true;
            default:
                return ActivityC10181.m25943((ActivityC10181) this.f41402, menuItem);
        }
    }

    @Override // l.InterfaceC7034
    /* JADX INFO: renamed from: ۙ */
    public /* synthetic */ void mo2748() {
    }

    @Override // l.InterfaceC21921
    /* JADX INFO: renamed from: ۙ */
    public void mo1855(int i) {
        switch (this.f41401) {
            case 2:
                ((C19557) this.f41402).mo21455(i);
                break;
            default:
                ((InterfaceC20302) this.f41402).mo45816((int) (i * 0.6f));
                break;
        }
    }

    @Override // l.InterfaceC7034
    /* JADX INFO: renamed from: ۙ */
    public void mo2749(C21145 c21145, BufferedOutputStream bufferedOutputStream) throws IOException {
        bufferedOutputStream.write((byte[]) this.f41402);
    }

    @Override // l.InterfaceC20544
    /* JADX INFO: renamed from: ۙ */
    public boolean mo2120(String str) {
        return ((String) this.f41402).equals(str);
    }
}
