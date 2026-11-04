package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟ۖۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9BL */
/* JADX INFO: loaded from: classes4.dex */
public final class C7580 extends AbstractC9816 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f25045 = new ArrayList();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C0868 f25046;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC0122 f25047;

    public C7580(C0868 c0868, AbstractC0122 abstractC0122) {
        this.f25046 = c0868;
        this.f25047 = abstractC0122;
    }

    @Override // l.AbstractC9816
    /* JADX INFO: renamed from: ۙ */
    public final void mo3539(String str) {
        this.f25045.add(str);
        this.f25047.getClass();
        this.f25046.mo3539(AbstractC0122.m1265(str));
    }

    @Override // l.AbstractC9816
    /* JADX INFO: renamed from: ۤ */
    public final void mo3542(String str) {
        ArrayList arrayList = this.f25045;
        String str2 = (String) C18011.m41990(arrayList, 1);
        String str3 = str2 + "$" + str;
        arrayList.add(str3);
        this.f25047.getClass();
        String strM34972 = C14483.m34972(AbstractC0122.m1265(str2), "$");
        String strM1265 = AbstractC0122.m1265(str3);
        this.f25046.mo3542(strM1265.substring(strM1265.startsWith(strM34972) ? strM34972.length() : strM1265.lastIndexOf(36) + 1));
    }

    @Override // l.AbstractC9816
    /* JADX INFO: renamed from: ᩷ */
    public final void mo3549(String str) {
        this.f25046.mo3549(str);
    }

    @Override // l.AbstractC9816
    /* JADX INFO: renamed from: ᩸ */
    public final void mo3551(String str) {
        this.f25046.mo3551(str);
    }

    @Override // l.AbstractC9816
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC9816 mo3537() {
        this.f25046.mo3537();
        return this;
    }

    @Override // l.AbstractC9816
    /* JADX INFO: renamed from: ۙ */
    public final void mo3538(char c) {
        this.f25046.mo3538(c);
    }

    @Override // l.AbstractC9816
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC9816 mo3547() {
        this.f25046.getClass();
        return this;
    }

    @Override // l.AbstractC9816
    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC9816 mo3550() {
        this.f25046.mo3550();
        return this;
    }

    @Override // l.AbstractC9816
    /* JADX INFO: renamed from: ᩴ */
    public final AbstractC9816 mo3546() {
        this.f25046.getClass();
        return this;
    }

    @Override // l.AbstractC9816
    /* JADX INFO: renamed from: ܳ */
    public final AbstractC9816 mo3545() {
        this.f25046.mo3545();
        return this;
    }

    @Override // l.AbstractC9816
    /* JADX INFO: renamed from: ۫ */
    public final AbstractC9816 mo3544() {
        this.f25046.mo3544();
        return this;
    }

    @Override // l.AbstractC9816
    /* JADX INFO: renamed from: ۚ */
    public final AbstractC9816 mo3540() {
        this.f25046.mo3540();
        return this;
    }

    @Override // l.AbstractC9816
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC9816 mo3536() {
        this.f25046.mo3536();
        return this;
    }

    @Override // l.AbstractC9816
    /* JADX INFO: renamed from: ۧ */
    public final void mo3543() {
        this.f25046.mo3543();
    }

    @Override // l.AbstractC9816
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC9816 mo3548(char c) {
        this.f25046.mo3548(c);
        return this;
    }

    @Override // l.AbstractC9816
    /* JADX INFO: renamed from: ۤ */
    public final void mo3541() {
        this.f25046.mo3541();
        C2764.m9138(this.f25045, 1);
    }
}
