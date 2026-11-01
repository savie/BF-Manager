package l;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.display.VirtualDisplay;
import android.media.Image;
import android.media.ImageReader;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.۫ܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAKQ */
/* JADX INFO: loaded from: classes3.dex */
public class ServiceC12465 extends Service implements ImageReader.OnImageAvailableListener {

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f41554;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f41556 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ImageReader f41557;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f41558;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C23048 f41560;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public VirtualDisplay f41562;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C13170 f41564;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f41565;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C7312 f41567;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public Intent f41568;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f41569;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C7312 f41571;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public MediaProjection f41572;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f41573;

    /* JADX INFO: renamed from: ᩵᩹۫, reason: not valid java name and contains not printable characters */
    private static final short[] f41555 = {2284, -1273, -1278, -1257, -1278};

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public static final Handler f41553 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public Point f41566 = new Point();

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public Point f41559 = new Point();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Rect f41563 = new Rect();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public BroadcastReceiver f41570 = new C20931(this);

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int[] f41574 = new int[2];

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public Rect f41561 = new Rect();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0288 A[PHI: r19
      0x0288: PHI (r19v20 android.os.Parcelable) = 
      (r19v1 android.os.Parcelable)
      (r19v2 android.os.Parcelable)
      (r19v19 android.os.Parcelable)
      (r19v21 android.os.Parcelable)
     binds: [B:67:0x0286, B:63:0x0267, B:11:0x0046, B:6:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (l.RunnableC0195.f1321 >= 0) goto L14;
     */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int onStartCommand(android.content.Intent r18, int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ServiceC12465.onStartCommand(android.content.Intent, int, int):int");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m30963(AbstractActivityC12483 abstractActivityC12483) {
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        C12562 c12562 = (C12562) viewM30995.findViewById(R.id.MT_Protector);
        C12562 c12563 = (C12562) viewM30995.findViewById(R.id.MT_Protector);
        Spinner spinner = (Spinner) viewM30995.findViewById(R.id.spinner1);
        Spinner spinner2 = (Spinner) viewM30995.findViewById(R.id.spinner2);
        Spinner spinner3 = (Spinner) viewM30995.findViewById(R.id.MT_Protector);
        spinner.setAdapter((SpinnerAdapter) new C0733(abstractActivityC12483, abstractActivityC12483.getResources().getStringArray(R.array.MT_Protector)));
        spinner2.setAdapter((SpinnerAdapter) new C0733(abstractActivityC12483, abstractActivityC12483.getResources().getStringArray(R.array.MT_Protector)));
        spinner3.setAdapter((SpinnerAdapter) new C0733(abstractActivityC12483, abstractActivityC12483.getResources().getStringArray(R.array.MT_Protector)));
        c12562.setChecked(C17403.m40561());
        c12563.setChecked(C17403.m40552());
        spinner.setSelection(C17403.m40556());
        spinner2.setSelection(C17403.m40562());
        spinner3.setSelection(C17403.m40558());
        c12562.setOnCheckedChangeListener(new C20274(1));
        c12563.setOnCheckedChangeListener(new C8937());
        spinner.setOnItemSelectedListener(new C15993(new C15287()));
        spinner2.setOnItemSelectedListener(new C15993(new C21636()));
        spinner3.setOnItemSelectedListener(new C15993(new C18108()));
        DialogInterfaceC19356[] dialogInterfaceC19356Arr = new DialogInterfaceC19356[1];
        viewM30995.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC7525(new C10348(dialogInterfaceC19356Arr)));
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21258(viewM30995);
        DialogInterfaceC19356 dialogInterfaceC19356M10334 = C3509.m10334(c8067BuildDialog, f41554 ? R.string.MT_Protector : R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        dialogInterfaceC19356Arr[0] = dialogInterfaceC19356M10334;
        if (abstractActivityC12483 instanceof ActivityC9932) {
            dialogInterfaceC19356M10334.m44367(new DialogInterfaceOnDismissListenerC18814(abstractActivityC12483, 0));
        }
        dialogInterfaceC19356M10334.m44373().setOnClickListener(new ViewOnClickListenerC22922(2, abstractActivityC12483));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30952(AbstractActivityC12483 abstractActivityC12483) {
        if (f41554) {
            C16737.m39277().stopService(new Intent(C16737.m39277(), (Class<?>) ServiceC12465.class));
            return;
        }
        if (!C6696.m18094(abstractActivityC12483)) {
            try {
                C16125.m38167(abstractActivityC12483, null);
                return;
            } catch (Throwable th) {
                abstractActivityC12483.m31002(th, (DialogInterface.OnDismissListener) null);
                return;
            }
        }
        if (abstractActivityC12483 instanceof Main) {
            ((Main) abstractActivityC12483).m115();
        } else {
            if (abstractActivityC12483 instanceof ActivityC9932) {
                ((ActivityC9932) abstractActivityC12483).m25136();
                return;
            }
            throw new RuntimeException();
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f41565 = getResources().getConfiguration().orientation;
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(new NotificationChannel("MT_COLOR_PICKER", getString(R.string.MT_Protector), 3));
        }
        Intent intent = new Intent(this, (Class<?>) Main.class);
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 67108864);
        C3577 c3577 = new C3577(this, "MT_COLOR_PICKER");
        c3577.m10592();
        c3577.m10586(C16737.m39288(R.string.MT_Protector));
        c3577.m10583(activity);
        c3577.m10590();
        c3577.m10588(false);
        startForeground(1001, c3577.m10581());
        this.f41571 = (C7312) LayoutInflater.from(this).inflate(R.layout.MT_Protector, (ViewGroup) null);
        this.f41567 = (C7312) LayoutInflater.from(this).inflate(R.layout.MT_Protector, (ViewGroup) null);
        this.f41564 = (C13170) this.f41571.getChildAt(0);
        C23048 c23048 = (C23048) this.f41567.getChildAt(0);
        this.f41560 = c23048;
        c23048.m50986((TextView) this.f41567.findViewById(R.id.MT_Protector));
        this.f41571.m19520();
        int[] iArr = new int[2];
        this.f41571.m19516(new C0469(this, iArr));
        this.f41571.m19517(new C14472(this, iArr));
        int iM40565 = C17403.m40565();
        for (int i = 0; i < 2; i++) {
            View childAt = this.f41567.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            layoutParams.height = iM40565;
            layoutParams.width = iM40565;
            childAt.setLayoutParams(layoutParams);
        }
        this.f41567.setOnClickListener(new ViewOnClickListenerC8105(2, this));
        this.f41567.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.۠ܳۚ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                ServiceC12465 serviceC12465 = this.f28650;
                return serviceC12465.f41560.m50987(serviceC12465.f41567.m19522(), serviceC12465.f41567.m19521());
            }
        });
        this.f41567.m19520();
        Point point = new Point();
        this.f41567.m19516(new C16698(this, point));
        this.f41567.m19517(new C8811(this, point));
        f41554 = true;
        C16737.m39270(new Intent("ScreenColorPicker.ACTION_START"));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("ScreenColorPickerConfig.ACTION_CONFIG_CHANGED");
        C16737.m39269(this.f41570, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public void m30954() {
        Runnable[] runnableArr = {null};
        runnableArr[0] = new RunnableC16075(2, this);
        if (this.f41571.isAttachedToWindow()) {
            m30968();
            C16737.m39274(runnableArr[0], 15L);
        } else {
            runnableArr[0].run();
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static void m30943(ServiceC12465 serviceC12465) {
        int dimension;
        Display defaultDisplay = ((WindowManager) serviceC12465.getApplicationContext().getSystemService("window")).getDefaultDisplay();
        defaultDisplay.getSize(serviceC12465.f41559);
        Point point = serviceC12465.f41566;
        defaultDisplay.getRealSize(point);
        C13170 c13170 = serviceC12465.f41564;
        if (c13170 == null || (dimension = c13170.getWidth()) <= 0) {
            dimension = (int) serviceC12465.getResources().getDimension(R.dimen.MT_Protector);
        }
        int i = dimension / 2;
        serviceC12465.f41571.m19515((point.x / 2) - i, (point.y / 2) - i);
        serviceC12465.f41571.m19518(new C19520(serviceC12465));
        serviceC12465.f41571.m19514();
        serviceC12465.m30958();
        C16737.m39267(500L, new RunnableC19814(1, serviceC12465));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30950(ServiceC12465 serviceC12465, Point point, float f, float f2) {
        float fM40550 = C17403.m40550();
        serviceC12465.m30947(point.x + ((int) (f / fM40550)), point.y + ((int) (f2 / fM40550)));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m30958() {
        int i = getResources().getDisplayMetrics().densityDpi;
        this.f41572 = ((MediaProjectionManager) getApplicationContext().getSystemService("media_projection")).getMediaProjection(-1, this.f41568);
        Point point = this.f41566;
        ImageReader imageReaderNewInstance = ImageReader.newInstance(point.x, point.y, 1, 1);
        this.f41557 = imageReaderNewInstance;
        this.f41562 = this.f41572.createVirtualDisplay("MT_COLOR_PICKER", point.x, point.y, i, 16, imageReaderNewInstance.getSurface(), null, null);
        this.f41573 = false;
        this.f41557.setOnImageAvailableListener(this, f41553);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m30961() {
        VirtualDisplay virtualDisplay = this.f41562;
        if (virtualDisplay != null) {
            virtualDisplay.release();
            this.f41562 = null;
        }
        ImageReader imageReader = this.f41557;
        if (imageReader != null) {
            imageReader.close();
            this.f41557 = null;
        }
        MediaProjection mediaProjection = this.f41572;
        if (mediaProjection != null) {
            mediaProjection.stop();
            this.f41572 = null;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m30968() {
        m30961();
        C7312 c7312 = this.f41571;
        if (c7312 != null) {
            c7312.m19513();
        }
        C7312 c7313 = this.f41567;
        if (c7313 != null) {
            c7313.m19513();
        }
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = this.f41565;
        int i2 = configuration.orientation;
        if (i != i2) {
            this.f41565 = i2;
            m30968();
            C16737.m39274(new RunnableC13043(2, this), 50L);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        m30968();
        f41554 = false;
        C16737.m39270(new Intent("ScreenColorPicker.ACTION_STOP"));
        int i = C17403.f55385;
        C16737.m39268(this.f41570);
        stopForeground(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m30947(int i, int i2) {
        int dimension;
        int iM40565;
        int i3;
        Point point = this.f41566;
        int i4 = 0;
        if (i < 0) {
            i = 0;
        } else {
            int i5 = point.x;
            if (i >= i5) {
                i = i5 - 1;
            }
        }
        if (i2 < 0) {
            i2 = 0;
        } else {
            int i6 = point.y;
            if (i2 >= i6) {
                i2 = i6 - 1;
            }
        }
        Rect rect = this.f41563;
        int i7 = -rect.left;
        int i8 = -rect.top;
        C13170 c13170 = this.f41564;
        if (c13170 == null || (dimension = c13170.getWidth()) <= 0) {
            dimension = (int) getResources().getDimension(R.dimen.MT_Protector);
        }
        C23048 c23048 = this.f41560;
        if (c23048 == null || (iM40565 = c23048.getWidth()) <= 0) {
            iM40565 = C17403.m40565();
        }
        this.f41569 = i;
        this.f41558 = i2;
        int i9 = dimension / 2;
        int i10 = i - i9;
        int i11 = i2 - i9;
        int i12 = rect.left;
        if (i10 <= i12) {
            i3 = i10 - i12;
        } else {
            int i13 = i10 + dimension;
            int i14 = rect.right;
            i3 = i13 >= i14 ? i13 - i14 : 0;
        }
        int i15 = rect.top;
        if (i11 <= i15) {
            i4 = i11 - i15;
        } else {
            int i16 = dimension + i11;
            int i17 = rect.bottom;
            if (i16 >= i17) {
                i4 = i16 - i17;
            }
        }
        this.f41564.m32562(i3, i4);
        this.f41571.m19515(i10 + i7, i11 + i8);
        if (point.x < point.y) {
            int i18 = (i - (iM40565 / 2)) + i7;
            float f = i2;
            float f2 = iM40565;
            int i19 = ((int) (f - (1.5f * f2))) + i8;
            if (i19 <= 0) {
                i19 = ((int) ((f2 * 0.5f) + f)) + i8;
            }
            this.f41567.m19515(i18, i19);
            return;
        }
        int i20 = (i2 - (iM40565 / 2)) + i8;
        float f3 = i;
        float f4 = iM40565;
        int i21 = ((int) (f3 - (1.5f * f4))) + i7;
        if (i21 <= 0) {
            i21 = ((int) ((f4 * 0.5f) + f3)) + i7;
        }
        this.f41567.m19515(i21, i20);
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static void m30957(ServiceC12465 serviceC12465) {
        Rect rect = serviceC12465.f41563;
        int i = -rect.left;
        int i2 = -rect.top;
        int iM40565 = C17403.m40565();
        Point point = serviceC12465.f41566;
        if (point.x < point.y) {
            int i3 = (serviceC12465.f41569 - (iM40565 / 2)) + i;
            float f = serviceC12465.f41558;
            float f2 = iM40565;
            int i4 = ((int) (f - (1.5f * f2))) + i2;
            if (i4 <= 0) {
                i4 = ((int) ((f2 * 0.5f) + f)) + i2;
            }
            serviceC12465.f41567.m19515(i3, i4);
            return;
        }
        int i5 = (serviceC12465.f41558 - (iM40565 / 2)) + i2;
        float f3 = serviceC12465.f41569;
        float f4 = iM40565;
        int i6 = ((int) (f3 - (1.5f * f4))) + i;
        if (i6 <= 0) {
            i6 = ((int) ((f4 * 0.5f) + f3)) + i;
        }
        serviceC12465.f41567.m19515(i6, i5);
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        Image imageAcquireNextImage = imageReader.acquireNextImage();
        if (imageAcquireNextImage == null) {
            return;
        }
        if (!this.f41573) {
            this.f41573 = true;
        }
        this.f41571.getLocationOnScreen(this.f41574);
        int width = this.f41569;
        int height = this.f41558;
        int i = 0;
        if (width < 0) {
            width = 0;
        } else if (width >= imageAcquireNextImage.getWidth()) {
            width = imageAcquireNextImage.getWidth() - 1;
        }
        if (height < 0) {
            height = 0;
        } else if (height >= imageAcquireNextImage.getHeight()) {
            height = imageAcquireNextImage.getHeight() - 1;
        }
        int iM32560 = this.f41564.m32560();
        Rect rect = this.f41561;
        rect.set(width - iM32560, height - iM32560, width + iM32560 + 1, iM32560 + height + 1);
        C23048 c23048 = this.f41560;
        int width2 = imageAcquireNextImage.getWidth();
        int height2 = imageAcquireNextImage.getHeight();
        int iWidth = rect.width();
        int iHeight = rect.height();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iWidth, iHeight, Bitmap.Config.ARGB_8888);
        Image.Plane plane = imageAcquireNextImage.getPlanes()[0];
        ByteBuffer buffer = plane.getBuffer();
        int rowStride = plane.getRowStride();
        int pixelStride = plane.getPixelStride();
        int i2 = 0;
        while (i2 < iHeight) {
            while (i < iWidth) {
                int i3 = rect.left + i;
                int i4 = iWidth;
                int i5 = rect.top + i2;
                if (i3 < 0 || i3 >= width2 || i5 < 0 || i5 >= height2) {
                    bitmapCreateBitmap.setPixel(i, i2, 0);
                } else {
                    buffer.position((i3 * pixelStride) + (i5 * rowStride));
                    bitmapCreateBitmap.setPixel(i, i2, Color.argb(255, buffer.get() & 255, buffer.get() & 255, buffer.get() & 255));
                }
                i++;
                iWidth = i4;
                rect = rect;
                width2 = width2;
            }
            i2++;
            i = 0;
        }
        c23048.m50985(bitmapCreateBitmap, width, height);
        imageAcquireNextImage.close();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m30944() {
        return f41554;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m30955(ServiceC12465 serviceC12465) {
        if (!f41554 || serviceC12465.f41573) {
            return;
        }
        serviceC12465.m30961();
        serviceC12465.m30958();
        C16737.m39267(500L, new RunnableC7981(2, serviceC12465));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m30962(ServiceC12465 serviceC12465) {
        if (!f41554 || serviceC12465.f41573) {
            return;
        }
        serviceC12465.m30961();
        serviceC12465.m30958();
        C16737.m39267(500L, new RunnableC14990(2, serviceC12465));
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static void m30969(ServiceC12465 serviceC12465) {
        if (!f41554 || serviceC12465.f41573) {
            return;
        }
        C15829.m37619("Getting screen image timed out");
        serviceC12465.stopSelf();
    }
}
