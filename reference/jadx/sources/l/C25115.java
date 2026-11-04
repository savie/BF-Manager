package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.concurrent.CancellationException;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩻ܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7PP */
/* JADX INFO: loaded from: classes.dex */
public final class C25115 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f81223;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f81224;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f81225;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f81226;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24132 f81227;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int[] f81228;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16163 f81229;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C18360 f81230;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f81231;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC19106 f81232;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18415 f81233;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7919 f81234;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f81235;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f81236;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC24329 f81237;

    public C25115(C16163 c16163, C7919 c7919, InterfaceC19106 interfaceC19106, int i, C18415 c18415, int i2, int[] iArr, String str, boolean z, int i3, boolean z2, InterfaceC24329 interfaceC24329, C24132 c24132, AbstractActivityC17204 abstractActivityC17204) {
        this.f81229 = c16163;
        this.f81234 = c7919;
        this.f81232 = interfaceC19106;
        this.f81236 = i;
        this.f81233 = c18415;
        this.f81226 = i2;
        this.f81228 = iArr;
        this.f81235 = str;
        this.f81231 = z;
        this.f81224 = i3;
        this.f81223 = z2;
        this.f81237 = interfaceC24329;
        this.f81227 = c24132;
        this.f81225 = abstractActivityC17204;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        this.f81229.f52469 = true;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        C7919 c7919 = this.f81234;
        c7919.m21468();
        RunnableC1953 runnableC1953 = new RunnableC1953(c7919);
        C15508 c15508Mo15337 = this.f81232.mo15337();
        try {
            c15508Mo15337.m37180(runnableC1953);
            c7919.m21468();
            if (c15508Mo15337.m37177() != this.f81236) {
                throw new CancellationException();
            }
            C4245 c4245Matcher = this.f81233.matcher((CharSequence) c15508Mo15337);
            c4245Matcher.m13565(false);
            c4245Matcher.m13553(runnableC1953);
            int i = this.f81226;
            int[] iArr = this.f81228;
            if (i == 1) {
                iArr[0] = c15508Mo15337.lastIndexOf('\n', 0, iArr[0]) + 1;
                int iIndexOf = c15508Mo15337.indexOf('\n', iArr[1], c15508Mo15337.length());
                iArr[1] = iIndexOf;
                if (iIndexOf == -1) {
                    iArr[1] = c15508Mo15337.length();
                }
            } else if (i == 2) {
                iArr[1] = iArr[0];
                iArr[0] = 0;
            } else if (i == 3) {
                iArr[0] = iArr[1];
                iArr[1] = c15508Mo15337.length();
            } else if (i != 0) {
                iArr[0] = 0;
                iArr[1] = c15508Mo15337.length();
            }
            c4245Matcher.m13567region(iArr[0], iArr[1]);
            String str = this.f81235;
            boolean z = this.f81231;
            int i2 = this.f81224;
            boolean z2 = this.f81223;
            final InterfaceC24329 interfaceC24329 = this.f81237;
            this.f81230 = C18360.m42816(c15508Mo15337, c4245Matcher, str, z, i2, z2, runnableC1953, new Supplier() { // from class: l.ۧܳᩴ
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new C2830(interfaceC24329, C19304.m44676(), 0);
                }
            });
            c7919.m21468();
            c15508Mo15337.close();
        } catch (Throwable th) {
            try {
                c15508Mo15337.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f81234.m21462()) {
            if (this.f81230.count() != 0) {
                this.f81230.m42829(this.f81227, this.f81232, this.f81223);
                C22673.m51154((CharSequence) C21576.m49059(R.string.MT_Protector, Integer.valueOf(this.f81230.count())));
            } else {
                C22673.m51152(R.string.MT_Protector);
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (this.f81234.m21467() && !(exc instanceof CancellationException)) {
            this.f81225.m40401(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C16163 c16163 = this.f81229;
        C7919 c7919 = this.f81234;
        try {
            C18360 c18360 = this.f81230;
            if (c18360 != null) {
                c18360.close();
            }
        } finally {
            c7919.m21466();
            c16163.f52469 = false;
        }
    }
}
