package l;

import android.app.Activity;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.۠᩷ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: MAMP */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC4079(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f = "WindowInfoTrackerImpl.kt", l = {ThreefishEngine.Threefish512Cipher.ROTATION_3_2, ThreefishEngine.Threefish1024Cipher.ROTATION_1_3}, m = "invokeSuspend")
public final class C8895 extends AbstractC7808 implements InterfaceC23955 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public InterfaceC7171 f29070;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7404 f29071;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Activity f29072;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f29073;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public InterfaceC0818 f29074;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public /* synthetic */ Object f29075;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8895(C7404 c7404, Activity activity, InterfaceC4825 interfaceC4825) {
        super(interfaceC4825);
        this.f29071 = c7404;
        this.f29072 = activity;
    }

    @Override // l.AbstractC20487
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4825 mo23811(Object obj, InterfaceC4825 interfaceC4825) {
        C8895 c8895 = new C8895(this.f29071, this.f29072, interfaceC4825);
        c8895.f29075 = obj;
        return c8895;
    }

    @Override // l.InterfaceC23955
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3124(Object obj, Object obj2) {
        return ((C8895) mo23811(obj, (InterfaceC4825) obj2)).mo10983(C11471.f36082);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:29:0x0081 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:7:0x0016, B:23:0x0067, B:27:0x0079, B:29:0x0081, B:12:0x002b, B:21:0x0062), top: B:37:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0096  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0096 -> B:23:0x0067). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // l.AbstractC20487
    /* JADX INFO: renamed from: ᩷ */
    public final java.lang.Object mo10983(java.lang.Object r11) {
        /*
            r10 = this;
            l.ܺۢ᩵ r0 = l.EnumC16757.COROUTINE_SUSPENDED
            int r1 = r10.f29073
            r2 = 2
            r3 = 1
            l.ۜ᩷ۤ r4 = r10.f29071
            if (r1 == 0) goto L34
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1b
            l.ۜ۬᩵ r1 = r10.f29070
            l.֨֨ r5 = r10.f29074
            java.lang.Object r6 = r10.f29075
            l.ۗۙۨ r6 = (l.InterfaceC3174) r6
            l.C19676.m45348(r11)     // Catch: java.lang.Throwable -> L31
            r11 = r6
            goto L66
        L1b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L23:
            l.ۜ۬᩵ r1 = r10.f29070
            l.֨֨ r5 = r10.f29074
            java.lang.Object r6 = r10.f29075
            l.ۗۙۨ r6 = (l.InterfaceC3174) r6
            l.C19676.m45348(r11)     // Catch: java.lang.Throwable -> L31
            r7 = r6
            r6 = r10
            goto L79
        L31:
            r11 = move-exception
            goto La2
        L34:
            l.C19676.m45348(r11)
            java.lang.Object r11 = r10.f29075
            l.ۗۙۨ r11 = (l.InterfaceC3174) r11
            l.ᩳ۬᩵ r1 = l.EnumC19104.DROP_OLDEST
            l.ᩳ۬᩵ r5 = l.EnumC19104.SUSPEND
            r6 = 10
            if (r1 != r5) goto L49
            l.ۡ۬᩵ r1 = new l.ۡ۬᩵
            r1.<init>(r6)
            goto L4f
        L49:
            l.ܳۙۨ r5 = new l.ܳۙۨ
            r5.<init>(r6, r1)
            r1 = r5
        L4f:
            l.ۖ᩷ۤ r5 = new l.ۖ᩷ۤ
            r5.<init>(r1)
            l.۟᩷ۤ r6 = l.C7404.m20318(r4)
            l.᩵᩶᩷ r7 = new l.᩵᩶᩷
            r7.<init>()
            android.app.Activity r8 = r10.f29072
            r6.mo2994(r8, r7, r5)
            l.ۜ۬᩵ r1 = r1.m24781()     // Catch: java.lang.Throwable -> L31
        L66:
            r6 = r10
        L67:
            r6.f29075 = r11     // Catch: java.lang.Throwable -> L31
            r6.f29074 = r5     // Catch: java.lang.Throwable -> L31
            r6.f29070 = r1     // Catch: java.lang.Throwable -> L31
            r6.f29073 = r3     // Catch: java.lang.Throwable -> L31
            java.lang.Object r7 = r1.mo19742(r6)     // Catch: java.lang.Throwable -> L31
            if (r7 != r0) goto L76
            goto L95
        L76:
            r9 = r7
            r7 = r11
            r11 = r9
        L79:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L31
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r11 == 0) goto L98
            java.lang.Object r11 = r1.next()     // Catch: java.lang.Throwable -> L31
            l.۬᩷ۤ r11 = (l.C14115) r11     // Catch: java.lang.Throwable -> L31
            r6.f29075 = r7     // Catch: java.lang.Throwable -> L31
            r6.f29074 = r5     // Catch: java.lang.Throwable -> L31
            r6.f29070 = r1     // Catch: java.lang.Throwable -> L31
            r6.f29073 = r2     // Catch: java.lang.Throwable -> L31
            java.lang.Object r11 = r7.mo10365(r11, r6)     // Catch: java.lang.Throwable -> L31
            if (r11 != r0) goto L96
        L95:
            return r0
        L96:
            r11 = r7
            goto L67
        L98:
            l.۟᩷ۤ r11 = l.C7404.m20318(r4)
            r11.mo2995(r5)
            l.ۧ۟᩵ r11 = l.C11471.f36082
            return r11
        La2:
            l.۟᩷ۤ r0 = l.C7404.m20318(r4)
            r0.mo2995(r5)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8895.mo10983(java.lang.Object):java.lang.Object");
    }
}
