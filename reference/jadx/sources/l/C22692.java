package l;

import android.content.DialogInterface;
import bin.mt.plus.Main;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩺ۖ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 38V8 */
/* JADX INFO: loaded from: classes.dex */
public final class C22692 extends AbstractC3492 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f73914;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f73915;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14931 f73916;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f73917;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC9677 f73918;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f73919;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f73921;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public StringBuilder f73913 = new StringBuilder();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C22959 f73920 = C22959.m50797();

    public C22692(C14931 c14931, Main main, List list, boolean z, boolean z2, boolean z3, AbstractC9677 abstractC9677) {
        this.f73916 = c14931;
        this.f73914 = main;
        this.f73921 = list;
        this.f73917 = z;
        this.f73915 = z2;
        this.f73919 = z3;
        this.f73918 = abstractC9677;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10245(this.f73914);
        this.f12806.m40700().setSingleLine(false);
        this.f12806.m40700().setMaxLines(3);
        this.f12806.m40697((Runnable) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        this.f73920.m50802();
        Iterator it = this.f73921.iterator();
        while (it.hasNext()) {
            m50252((InterfaceC2557) it.next(), "");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50252(InterfaceC2557 interfaceC2557, String str) {
        if (interfaceC2557.mo7980() || this.f12806.m40693()) {
            return;
        }
        boolean z = this.f73917;
        StringBuilder sb = this.f73913;
        if (z) {
            sb.append(str);
            sb.append(interfaceC2557.getName());
        } else {
            sb.append(interfaceC2557.getPath());
        }
        if (this.f73915 && interfaceC2557.isDirectory()) {
            sb.append('/');
        }
        sb.append('\n');
        if (this.f73919 && interfaceC2557.isDirectory()) {
            if (this.f73920.m50802()) {
                C17485 c17485 = this.f12806;
                StringBuilder sbM23356 = C9023.m23356(str);
                sbM23356.append(interfaceC2557.getName());
                c17485.m40698(sbM23356.toString());
            }
            StringBuilder sbM23357 = C9023.m23356(str);
            sbM23357.append(interfaceC2557.getName());
            sbM23357.append("/");
            String string = sbM23357.toString();
            ArrayList arrayListMo10263 = this.f73918.mo10263(interfaceC2557.getPath(), true);
            C3386.m10046(arrayListMo10263, 0, false);
            Iterator it = arrayListMo10263.iterator();
            while (it.hasNext()) {
                m50252((InterfaceC2557) it.next(), string);
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f12806.m40693()) {
            return;
        }
        StringBuilder sb = this.f73913;
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        ActivityC21135.m47562(this.f73914, sb.toString(), C16737.m39288(this.f73916.m12942()), null, null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f73914.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
