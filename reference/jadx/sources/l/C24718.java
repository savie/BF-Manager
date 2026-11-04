package l;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.᩻֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6JU */
/* JADX INFO: loaded from: classes.dex */
public final class C24718 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f80005;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String f80006;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f80007;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C12765 f80008;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f80009;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f80010;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f80011;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17258 f80013;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String f80014;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile long f80015;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile C1707 f80016;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C5436 f80018;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f80019;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C23255 f80020;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String f80021;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f80022;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f80023;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f80026;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile long f80028;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f80029;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f80030;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile InputStream f80031;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public AbstractC21976 f80032;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f80033;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f80027 = new AtomicBoolean();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C12919 f80024 = new C12919();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f80012 = new AtomicLong();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final RunnableC1597 f80025 = new Runnable() { // from class: l.֫֫ܳ
        @Override // java.lang.Runnable
        public final void run() {
            C24718 c24718 = this.f5496;
            if (c24718.f80013.f56223 != c24718 || c24718.f80010) {
                return;
            }
            C17258.m40542(c24718.f80013, c24718);
        }
    };

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final RunnableC11291 f80017 = new Runnable() { // from class: l.ۧ֫ܳ
        @Override // java.lang.Runnable
        public final void run() {
            C24718 c24718 = this.f35607;
            c24718.f80027.set(false);
            c24718.f80013.m40533(c24718, c24718.f80012.get(), c24718.f80028, c24718.f80015);
        }
    };

    /* JADX WARN: Type inference failed for: r0v3, types: [l.֫֫ܳ] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.ۧ֫ܳ] */
    public C24718(C17258 c17258, String str, String str2, String str3, long j) {
        this.f80013 = c17258;
        this.f80014 = str;
        this.f80022 = str2;
        this.f80006 = str3;
        this.f80028 = j;
        this.f80021 = c17258.f56231.getUrl();
    }
}
