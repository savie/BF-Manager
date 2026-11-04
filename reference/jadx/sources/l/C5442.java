package l;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import com.umeng.analytics.pro.am;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.ۚۚ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: M8S0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5442 extends GLSurfaceView {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f19011 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C2676 f19012;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public Surface f19013;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f19014;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final Sensor f19015;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f19016;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public SurfaceTexture f19017;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final SensorManager f19018;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f19019;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Handler f19020;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C19612 f19021;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f19022;

    public C5442(Context context) {
        this(context, null);
    }

    public C5442(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19016 = new CopyOnWriteArrayList();
        this.f19020 = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService(am.ac);
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f19018 = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.f19015 = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        C19612 c19612 = new C19612();
        this.f19021 = c19612;
        C15136 c15136 = new C15136(this, c19612);
        View.OnTouchListener viewOnTouchListenerC11407 = new ViewOnTouchListenerC11407(context, c15136);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f19012 = new C2676(windowManager.getDefaultDisplay(), viewOnTouchListenerC11407, c15136);
        this.f19014 = true;
        setEGLContextClientVersion(2);
        setRenderer(c15136);
        setOnTouchListener(viewOnTouchListenerC11407);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16269(InterfaceC12899 interfaceC12899) {
        this.f19016.add(interfaceC12899);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m16272(InterfaceC12899 interfaceC12899) {
        this.f19016.remove(interfaceC12899);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Surface m16270() {
        return this.f19013;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC19830 m16271() {
        return this.f19021;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19084 m16268() {
        return this.f19021;
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.f19022 = true;
        m16267();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.f19022 = false;
        m16267();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f19020.post(new RunnableC1848(this, 1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16264(C5442 c5442) {
        Surface surface = c5442.f19013;
        if (surface != null) {
            Iterator it = c5442.f19016.iterator();
            while (it.hasNext()) {
                ((InterfaceC12899) it.next()).mo4888();
            }
        }
        SurfaceTexture surfaceTexture = c5442.f19017;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
        c5442.f19017 = null;
        c5442.f19013 = null;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m16267() {
        boolean z = this.f19014 && this.f19022;
        Sensor sensor = this.f19015;
        if (sensor == null || z == this.f19019) {
            return;
        }
        C2676 c2676 = this.f19012;
        SensorManager sensorManager = this.f19018;
        if (z) {
            sensorManager.registerListener(c2676, sensor, 0);
        } else {
            sensorManager.unregisterListener(c2676);
        }
        this.f19019 = z;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m16266(C5442 c5442, SurfaceTexture surfaceTexture) {
        c5442.f19020.post(new RunnableC11435(1, c5442, surfaceTexture));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16265(C5442 c5442, SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = c5442.f19017;
        Surface surface = c5442.f19013;
        Surface surface2 = new Surface(surfaceTexture);
        c5442.f19017 = surfaceTexture;
        c5442.f19013 = surface2;
        Iterator it = c5442.f19016.iterator();
        while (it.hasNext()) {
            ((InterfaceC12899) it.next()).mo4874(surface2);
        }
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        if (surface != null) {
            surface.release();
        }
    }
}
