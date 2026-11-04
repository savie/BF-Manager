package l;

import android.content.Intent;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ܳۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: NAJ1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15118 extends AbstractC18900 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f49330 = 0;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public int f49331;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public long f49333;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public int f49334;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public long f49335;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public CharSequence f49339;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public long f49340;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public CharSequence f49344;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public boolean f49338 = false;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public boolean f49343 = false;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f49342 = new AtomicBoolean();

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f49341 = new AtomicBoolean();

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f49336 = new AtomicBoolean();

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f49332 = new AtomicBoolean();

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f49337 = new AtomicBoolean();

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo36391(Intent intent) {
        super.mo36391(intent);
        this.f49344 = m43867("ARG_MSG_FROM");
        this.f49339 = m43867("ARG_MSG_TO");
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final DialogInterfaceC8327 mo4862(AbstractActivityC17204 abstractActivityC17204) {
        C12765 c12765 = new C12765(abstractActivityC17204);
        c12765.m31635(new RunnableC22205(5, this));
        c12765.m31632(R.string.MT_Protector, new ViewOnClickListenerC24936(2, c12765));
        c12765.m31634(this.f49344);
        c12765.m31641(this.f49339);
        m43851().m40350(c12765.m31638(), new C17476(1, this, c12765));
        c12765.m31640();
        return c12765.m31638();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36388(AbstractC15118 abstractC15118, final C12765 c12765) {
        if (abstractC15118.m43852()) {
            c12765.m31643(abstractC15118.m43866());
        }
        if (abstractC15118.m43832()) {
            if (abstractC15118.f49338) {
                c12765.m31646(abstractC15118.m43839());
            } else {
                c12765.m31639(abstractC15118.m43839());
            }
        }
        if (abstractC15118.f49332.compareAndSet(true, false)) {
            c12765.m31645(abstractC15118.f49343 ? R.string.MT_Protector : R.string.MT_Protector);
        }
        if (abstractC15118.f49342.compareAndSet(true, false)) {
            c12765.m31647(abstractC15118.mo29448());
        }
        if (abstractC15118.f49341.compareAndSet(true, false)) {
            c12765.m31633(abstractC15118.f49335);
        }
        if (abstractC15118.f49336.compareAndSet(true, false)) {
            final boolean z = abstractC15118.f49338;
            Runnable runnable = new Runnable() { // from class: l.᩸֨ᩴ
                @Override // java.lang.Runnable
                public final void run() {
                    C12765.m31626(c12765, z);
                }
            };
            if (C22415.m50557()) {
                runnable.run();
            } else {
                C21576.m49068(runnable);
            }
        }
        if (abstractC15118.f49337.compareAndSet(true, false)) {
            c12765.m31634(abstractC15118.f49344);
            c12765.m31641(abstractC15118.f49339);
        }
        c12765.m31631(abstractC15118.m43849());
    }

    /* JADX INFO: renamed from: ᩷ */
    public void mo16841(CharSequence charSequence) {
        super.mo29447(charSequence);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m36394(boolean z) {
        this.f49343 = z;
        this.f49332.set(true);
        m43856();
    }

    /* JADX INFO: renamed from: ᩷ */
    public void mo16842(C1858 c1858) {
        this.f49334 = c1858.m6381();
        this.f49331 = c1858.m6385();
        this.f49333 = c1858.m6379();
        this.f49340 = c1858.m6383();
        this.f49342.set(true);
        m43856();
    }

    /* JADX INFO: renamed from: ۢۙ */
    public String mo29448() {
        int i = this.f49334;
        long j = this.f49333;
        long j2 = j - this.f49340;
        if (i == 1) {
            return C8311.m22390(j2) + "/" + C8311.m22390(j);
        }
        return (i - this.f49331) + " (" + C8311.m22390(j2) + "/" + C8311.m22390(j) + MotionUtils.EASING_TYPE_FORMAT_END;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo16838(long j) {
        this.f49335 = j;
        this.f49341.set(true);
        m43856();
    }

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final long m36390() {
        return this.f49335;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m36393(boolean z) {
        this.f49338 = z;
        this.f49336.set(true);
        m43856();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36392(String str, String str2) {
        this.f49344 = str;
        this.f49339 = str2;
        this.f49337.set(true);
        m43856();
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public final void mo36389() {
        super.mo36389();
        this.f49342.set(true);
        this.f49341.set(true);
        this.f49336.set(true);
        this.f49332.set(true);
        this.f49337.set(true);
    }
}
