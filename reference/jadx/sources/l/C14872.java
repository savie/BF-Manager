package l;

import android.app.Application;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Looper;
import com.alipay.sdk.m.y.c;

/* JADX INFO: renamed from: l.ܶ֡ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48SH */
/* JADX INFO: loaded from: classes4.dex */
public final class C14872 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f48594;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f48595;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f48596;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C3581 f48597;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15489 f48598;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C22217 f48599;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Looper f48600;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C6901 f48601;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public InterfaceC23949 f48602;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f48603;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f48604;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C2342 f48605;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C11218 f48606;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C2708 f48607;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public InterfaceC23949 f48608;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f48609;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f48610;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f48611;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C4078 f48612;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f48613;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C12755 f48614;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f48615;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ContextWrapper f48616;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public long f48617;

    public C14872(final Application application) {
        this(application, new InterfaceC23949() { // from class: l.ۜ֡ۙ
            @Override // l.InterfaceC23949
            public final Object get() {
                return new C3455(application);
            }
        }, new InterfaceC23949() { // from class: l.᩺֡ۙ
            @Override // l.InterfaceC23949
            public final Object get() {
                return new C1598(new C17195(application), new C18511());
            }
        });
    }

    public C14872(ActivityC10957 activityC10957, C3455 c3455, C1598 c1598) {
        this(activityC10957, new C21927(c3455), new C0759(c1598));
    }

    public C14872(ContextWrapper contextWrapper, InterfaceC23949 interfaceC23949, InterfaceC23949 interfaceC239410) {
        C12755 c12755 = new C12755(contextWrapper);
        C3581 c3581 = new C3581();
        C2342 c2342 = new C2342(1, contextWrapper);
        C15489 c15489 = new C15489(4);
        this.f48616 = contextWrapper;
        this.f48602 = interfaceC23949;
        this.f48608 = interfaceC239410;
        this.f48614 = c12755;
        this.f48597 = c3581;
        this.f48605 = c2342;
        this.f48598 = c15489;
        String str = C17983.f57504;
        Looper looperMyLooper = Looper.myLooper();
        this.f48600 = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        this.f48607 = C2708.f10419;
        this.f48594 = 1;
        this.f48609 = true;
        this.f48601 = C6901.f23229;
        this.f48603 = 5000L;
        this.f48604 = 15000L;
        this.f48617 = c.a;
        this.f48612 = C4078.f14988;
        this.f48606 = new C6278().m17354();
        this.f48599 = InterfaceC11593.f38960;
        this.f48611 = 500L;
        this.f48595 = 2000L;
        this.f48613 = true;
        this.f48615 = "";
        this.f48610 = -1000;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35566(C3455 c3455) {
        C2023.m6510(!this.f48596);
        this.f48602 = new C21927(c3455);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35565(C1598 c1598) {
        C2023.m6510(!this.f48596);
        this.f48608 = new C0759(c1598);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m35568() {
        C2023.m6510(!this.f48596);
        this.f48603 = 10000L;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m35567() {
        C2023.m6510(!this.f48596);
        this.f48604 = 15000L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17693 m35564() {
        C2023.m6510(!this.f48596);
        this.f48596 = true;
        return new C15348(this);
    }
}
