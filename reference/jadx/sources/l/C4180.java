package l;

import android.content.DialogInterface;
import android.content.Intent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۘ᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes3.dex */
public final class C4180 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C15676 f15226;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20409 f15227;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC11632 f15228;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C23229 f15229;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f15230;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C3329 f15231;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f15232;

    public C4180(C20409 c20409, ActivityC11632 activityC11632, String str, AbstractC20745 abstractC20745) {
        this.f15227 = c20409;
        this.f15228 = activityC11632;
        this.f15230 = str;
        this.f15232 = abstractC20745;
        this.f15229 = C23229.m51233(c20409.getViewLifecycleOwner());
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        this.f15231 = this.f15227.f66125.m17000().mo2398();
        m10249(this.f15228, this.f15229);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        C3329 c3329 = this.f15231;
        try {
            C15676 c15676M16271 = C5975.m16271(c3329);
            this.f15226 = c15676M16271;
            c15676M16271.m37349("<--id-c5skl23kjndf-->", this.f15230);
            this.f15232.m46735(this.f15226.mo19151());
            c3329.close();
        } catch (Throwable th) {
            if (c3329 != null) {
                try {
                    c3329.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f15229.m51236()) {
            long jMo33991 = this.f15232.mo33991();
            C20409 c20409 = this.f15227;
            c20409.f66139 = jMo33991;
            c20409.startActivity(new Intent(c20409.getContext(), (Class<?>) ActivityC14443.class));
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        String message;
        if (this.f15229.m51236()) {
            this.f15228.m31002(exc, (DialogInterface.OnDismissListener) null);
            if (!(exc instanceof C22003) || (message = ((C22003) exc).getMessage()) == null) {
                return;
            }
            Matcher matcher = Pattern.compile("at line (\\d+) column (\\d+)").matcher(message);
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                C13638.requireNonNull(strGroup);
                this.f15227.f66125.m17023(Integer.parseInt(strGroup) - 1);
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        C3329 c3329 = this.f15231;
        if (c3329 != null) {
            c3329.close();
        }
        m10251();
    }
}
