package l;

import android.app.Activity;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ۨۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: MAMP */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC19564(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f = "WindowInfoTrackerImpl.kt", l = {ThreefishEngine.Threefish512Cipher.ROTATION_3_2, ThreefishEngine.Threefish1024Cipher.ROTATION_1_3}, m = "invokeSuspend")
public final class C11682 extends AbstractC16037 implements InterfaceC8400 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public InterfaceC17295 f39287;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC3045 f39288;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Activity f39289;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2508 f39290;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public /* synthetic */ Object f39291;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f39292;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11682(C2508 c2508, Activity activity, InterfaceC14771 interfaceC14771) {
        super(interfaceC14771);
        this.f39290 = c2508;
        this.f39289 = activity;
    }

    @Override // l.AbstractC21680
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC14771 mo20747(Object obj, InterfaceC14771 interfaceC14771) {
        C11682 c11682 = new C11682(this.f39290, this.f39289, interfaceC14771);
        c11682.f39291 = obj;
        return c11682;
    }

    @Override // l.InterfaceC8400
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3208(Object obj, Object obj2) {
        return ((C11682) mo20747(obj, (InterfaceC14771) obj2)).mo11546(C7321.f24318);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    /* JADX WARN: Code duplicated, block: B:25:0x007d A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:7:0x0016, B:23:0x0075, B:25:0x007d, B:13:0x002f), top: B:35:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0092  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.ܳܰۨ] */
    /* JADX WARN: Type inference failed for: r12v9, types: [l.ܳܰۨ] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.ܰۨۨ] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5, types: [l.ܿۧ] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r5v1, types: [l.ܿۧ] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [l.ܿۧ] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v1, types: [l.ܳܰۨ] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0092 -> B:9:0x001b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // l.AbstractC21680
    /* JADX INFO: renamed from: ܰ */
    public final java.lang.Object mo11546(java.lang.Object r12) {
        /*
            r11 = this;
            l.۬ܺ۠ r0 = l.EnumC13214.COROUTINE_SUSPENDED
            int r1 = r11.f39292
            r2 = 2
            r3 = 1
            l.ۖۨۨ r4 = r11.f39290
            if (r1 == 0) goto L38
            if (r1 == r3) goto L27
            if (r1 != r2) goto L1f
            l.ۗۛ۠ r1 = r11.f39288
            l.ܿۧ r5 = r11.f39287
            java.lang.Object r6 = r11.f39291
            l.۠ۧ۠ r6 = (l.InterfaceC8130) r6
            l.C18610.m43015(r12)     // Catch: java.lang.Throwable -> L35
            r12 = r6
            r6 = r11
        L1b:
            r9 = r5
            r5 = r1
            r1 = r9
            goto L60
        L1f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L27:
            l.ۗۛ۠ r1 = r11.f39288
            l.ܿۧ r5 = r11.f39287
            java.lang.Object r6 = r11.f39291
            l.۠ۧ۠ r6 = (l.InterfaceC8130) r6
            l.C18610.m43015(r12)     // Catch: java.lang.Throwable -> L35
            r7 = r6
            r6 = r11
            goto L75
        L35:
            r12 = move-exception
            goto La0
        L38:
            l.C18610.m43015(r12)
            java.lang.Object r12 = r11.f39291
            l.۠ۧ۠ r12 = (l.InterfaceC8130) r12
            l.ۢۛ۠ r1 = l.EnumC9397.DROP_OLDEST
            l.֫ۛ۠ r5 = new l.֫ۛ۠
            r6 = 10
            r5.<init>(r6, r1)
            l.ܰۨۨ r1 = new l.ܰۨۨ
            r1.<init>(r5)
            l.ܳܰۨ r6 = l.C2508.m7641(r4)
            l.֫᩶ܰ r7 = new l.֫᩶ܰ
            r7.<init>()
            android.app.Activity r8 = r11.f39289
            r6.mo33697(r8, r7, r1)
            l.ۗۛ۠ r5 = r5.m16082()     // Catch: java.lang.Throwable -> L9e
            r6 = r11
        L60:
            r6.f39291 = r12     // Catch: java.lang.Throwable -> L9e
            r6.f39287 = r1     // Catch: java.lang.Throwable -> L9e
            r6.f39288 = r5     // Catch: java.lang.Throwable -> L9e
            r6.f39292 = r3     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r7 = r5.mo1596(r6)     // Catch: java.lang.Throwable -> L9e
            if (r7 != r0) goto L6f
            goto L91
        L6f:
            r9 = r7
            r7 = r12
            r12 = r9
            r10 = r5
            r5 = r1
            r1 = r10
        L75:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L35
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r12 == 0) goto L94
            java.lang.Object r12 = r1.next()     // Catch: java.lang.Throwable -> L35
            l.ۚۨۨ r12 = (l.C5331) r12     // Catch: java.lang.Throwable -> L35
            r6.f39291 = r7     // Catch: java.lang.Throwable -> L35
            r6.f39287 = r5     // Catch: java.lang.Throwable -> L35
            r6.f39288 = r1     // Catch: java.lang.Throwable -> L35
            r6.f39292 = r2     // Catch: java.lang.Throwable -> L35
            java.lang.Object r12 = r7.mo21429(r12, r6)     // Catch: java.lang.Throwable -> L35
            if (r12 != r0) goto L92
        L91:
            return r0
        L92:
            r12 = r7
            goto L1b
        L94:
            l.ܳܰۨ r12 = l.C2508.m7641(r4)
            r12.mo33698(r5)
            l.۟۟۠ r12 = l.C7321.f24318
            return r12
        L9e:
            r12 = move-exception
            r5 = r1
        La0:
            l.ܳܰۨ r0 = l.C2508.m7641(r4)
            r0.mo33698(r5)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11682.mo11546(java.lang.Object):java.lang.Object");
    }
}
