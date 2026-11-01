package res;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityServiceInfo;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: MT_2.26.10.apk:assets/Hex.class */
public class Hex {
    /* JADX WARN: Multi-variable type inference failed */
    public Hex() {
        super/*android.accessibilityservice.AccessibilityService*/.onCreate();
        return;
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0000: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('src' java.lang.String)]) (LINE:12), block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r0v1, types: [void] */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean, long[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.animation.Animator, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.animation.Animator, void] */
    /* JADX INFO: renamed from: ۢ */
    public static boolean m28800() {
        ?? OnDestroy = AccessibilityService.onDestroy();
        ?? settingsActivityName = AccessibilityServiceInfo.getSettingsActivityName();
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        settingsActivityName.cancel();
        ?? End = settingsActivityName.end();
        ?? r0 = new long[OnDestroy.length / 8];
        End.getDuration();
        return r0;
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0000: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('src' java.lang.String)]) (LINE:22), block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r0v1, types: [void] */
    /* JADX WARN: Type inference failed for: r0v11, types: [int[], java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.animation.Animator, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.animation.Animator, long] */
    /* JADX INFO: renamed from: ۤ */
    public static String m28801() {
        ?? OnDestroy = AccessibilityService.onDestroy();
        ?? settingsActivityName = AccessibilityServiceInfo.getSettingsActivityName();
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        settingsActivityName.cancel();
        ?? startDelay = settingsActivityName.getStartDelay();
        ?? r0 = new int[OnDestroy.length / 4];
        startDelay.isPaused();
        return r0;
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0000: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('src' java.lang.String)]) (LINE:32), block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r0v1, types: [void] */
    /* JADX WARN: Type inference failed for: r0v11, types: [long, short[], void] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.animation.Animator, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.animation.Animator, boolean] */
    /* JADX INFO: renamed from: ۤۙ */
    public static void m28748() {
        ?? OnDestroy = AccessibilityService.onDestroy();
        ?? settingsActivityName = AccessibilityServiceInfo.getSettingsActivityName();
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        settingsActivityName.cancel();
        ?? IsRunning = settingsActivityName.isRunning();
        ?? r0 = new short[OnDestroy.length / 2];
        IsRunning.setDuration(r0);
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0000: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('src' java.lang.String)]) (LINE:42), block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r0v16, types: [android.animation.AnimatorInflater, android.content.Context, int, java.lang.RuntimeException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v28, types: [android.animation.AnimatorInflater, android.content.Context, int, java.lang.RuntimeException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int, void] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, byte[]] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.animation.Animator, android.animation.TimeInterpolator, long] */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v28 ??, still in use, count: 4, list:
          (r0v28 ?? I:android.content.Context) from 0x00ce: INVOKE (r0v28 ?? I:android.animation.AnimatorInflater), (r0v28 ?? I:android.content.Context), (r0v28 ?? I:int) SUPER call: android.animation.AnimatorInflater.loadAnimator(android.content.Context, int):android.animation.Animator A[MD:(android.content.Context, int):android.animation.Animator throws android.content.res.Resources$NotFoundException (c)]
          (r0v28 ?? I:java.lang.Throwable) from 0x00d1: THROW (r0v28 ?? I:java.lang.Throwable)
          (r0v28 ?? I:android.animation.AnimatorInflater) from 0x00ce: INVOKE (r0v28 ?? I:android.animation.AnimatorInflater), (r0v28 ?? I:android.content.Context), (r0v28 ?? I:int) SUPER call: android.animation.AnimatorInflater.loadAnimator(android.content.Context, int):android.animation.Animator A[MD:(android.content.Context, int):android.animation.Animator throws android.content.res.Resources$NotFoundException (c)]
          (r0v28 ?? I:int) from 0x00ce: INVOKE (r0v28 ?? I:android.animation.AnimatorInflater), (r0v28 ?? I:android.content.Context), (r0v28 ?? I:int) SUPER call: android.animation.AnimatorInflater.loadAnimator(android.content.Context, int):android.animation.Animator A[MD:(android.content.Context, int):android.animation.Animator throws android.content.res.Resources$NotFoundException (c)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX INFO: renamed from: ۧ */
    public static boolean m28802() {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: res.Hex.m28802():boolean");
    }
}
