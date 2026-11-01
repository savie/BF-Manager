package l;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: B54W */
/* JADX INFO: loaded from: classes3.dex */
public final class C13829 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f45639;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public InterfaceC15616 f45641;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Interpolator f45642;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f45643 = -1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C10336 f45644 = new C4655(this);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f45640 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33654(C20554 c20554) {
        if (this.f45639) {
            return;
        }
        this.f45640.add(c20554);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33655(C20554 c20554, C20554 c20555) {
        ArrayList arrayList = this.f45640;
        arrayList.add(c20554);
        c20555.m46331(c20554.m46329());
        arrayList.add(c20555);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m33650() {
        if (this.f45639) {
            return;
        }
        for (C20554 c20554 : this.f45640) {
            long j = this.f45643;
            if (j >= 0) {
                c20554.m46324(j);
            }
            Interpolator interpolator = this.f45642;
            if (interpolator != null) {
                c20554.m46325(interpolator);
            }
            if (this.f45641 != null) {
                c20554.m46326(this.f45644);
            }
            c20554.m46328();
        }
        this.f45639 = true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m33657() {
        this.f45639 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33651() {
        if (this.f45639) {
            Iterator it = this.f45640.iterator();
            while (it.hasNext()) {
                ((C20554) it.next()).m46322();
            }
            this.f45639 = false;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m33656() {
        if (this.f45639) {
            return;
        }
        this.f45643 = 250L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33652(Interpolator interpolator) {
        if (this.f45639) {
            return;
        }
        this.f45642 = interpolator;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33653(C10336 c10336) {
        if (this.f45639) {
            return;
        }
        this.f45641 = c10336;
    }
}
