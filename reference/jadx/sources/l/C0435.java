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

/* JADX INFO: renamed from: l.֡۬ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8S0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0435 extends GLSurfaceView {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f2014 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Handler f2015;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f2016;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final SensorManager f2017;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Surface f2018;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Sensor f2019;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f2020;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f2021;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21602 f2022;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C20897 f2023;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f2024;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public SurfaceTexture f2025;

    public C0435(Context context) {
        this(context, null);
    }

    public C0435(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2016 = new CopyOnWriteArrayList();
        this.f2015 = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService(am.ac);
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f2017 = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.f2019 = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        C20897 c20897 = new C20897();
        this.f2023 = c20897;
        C15959 c15959 = new C15959(this, c20897);
        View.OnTouchListener viewOnTouchListenerC12431 = new ViewOnTouchListenerC12431(context, c15959);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f2022 = new C21602(windowManager.getDefaultDisplay(), viewOnTouchListenerC12431, c15959);
        this.f2020 = true;
        setEGLContextClientVersion(2);
        setRenderer(c15959);
        setOnTouchListener(viewOnTouchListenerC12431);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2259(InterfaceC20192 interfaceC20192) {
        this.f2016.add(interfaceC20192);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m2262(InterfaceC20192 interfaceC20192) {
        this.f2016.remove(interfaceC20192);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Surface m2260() {
        return this.f2018;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19841 m2261() {
        return this.f2023;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3962 m2258() {
        return this.f2023;
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.f2024 = true;
        m2254();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.f2024 = false;
        m2254();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2015.post(new RunnableC18517(1, this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2255(C0435 c0435) {
        Surface surface = c0435.f2018;
        if (surface != null) {
            Iterator it = c0435.f2016.iterator();
            while (it.hasNext()) {
                ((InterfaceC20192) it.next()).mo11582();
            }
        }
        SurfaceTexture surfaceTexture = c0435.f2025;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
        c0435.f2025 = null;
        c0435.f2018 = null;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m2254() {
        boolean z = this.f2020 && this.f2024;
        Sensor sensor = this.f2019;
        if (sensor == null || z == this.f2021) {
            return;
        }
        C21602 c21602 = this.f2022;
        SensorManager sensorManager = this.f2017;
        if (z) {
            sensorManager.registerListener(c21602, sensor, 0);
        } else {
            sensorManager.unregisterListener(c21602);
        }
        this.f2021 = z;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m2257(C0435 c0435, SurfaceTexture surfaceTexture) {
        c0435.f2015.post(new RunnableC22233(2, c0435, surfaceTexture));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2256(C0435 c0435, SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = c0435.f2025;
        Surface surface = c0435.f2018;
        Surface surface2 = new Surface(surfaceTexture);
        c0435.f2025 = surfaceTexture;
        c0435.f2018 = surface2;
        Iterator it = c0435.f2016.iterator();
        while (it.hasNext()) {
            ((InterfaceC20192) it.next()).mo11568(surface2);
        }
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        if (surface != null) {
            surface.release();
        }
    }
}
