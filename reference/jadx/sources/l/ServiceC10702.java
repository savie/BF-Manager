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
import android.os.Parcelable;
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
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۤۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAKQ */
/* JADX INFO: loaded from: classes3.dex */
public class ServiceC10702 extends Service implements ImageReader.OnImageAvailableListener {

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static boolean f33973;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f33975 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C16257 f33976;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f33977;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f33978;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C20442 f33980;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C16257 f33981;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f33982;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C24172 f33986;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ImageReader f33988;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public MediaProjection f33989;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public VirtualDisplay f33990;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f33991;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public Intent f33992;

    /* JADX INFO: renamed from: ֡ᩴ᩷, reason: not valid java name and contains not printable characters */
    private static final short[] f33972 = {5885, -5751, -5748, -5735, -5748};

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public static final Handler f33974 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public Point f33985 = new Point();

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public Point f33993 = new Point();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Rect f33984 = new Rect();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public BroadcastReceiver f33987 = new C8508(this);

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int[] f33983 = new int[2];

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public Rect f33979 = new Rect();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        Parcelable parcelableExtra = null;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        short[] sArr = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = -157155575;
        int i9 = C1542.f5343;
        int i10 = C2966.f9654;
        int iM2761 = (C0619.m2761("֫᩵") + i10) * (-49);
        int i11 = ((iM2761 ^ i9) * 28985) ^ 1466560331;
        int i12 = -1117754922;
        while (true) {
            i8 = ((((i8 ^ i9) * (-31733)) >> 31) & i11) ^ (iM2761 ^ i12);
            switch (i8) {
                case -2084974236:
                case -876420204:
                    i5 = 59885;
                    iM2761 = C0773.m3169("ܿ᩹") ^ i9;
                    i11 = ((iM2761 ^ i10) * (-31937)) ^ (-370992459);
                    i12 = -2016071912;
                    break;
                case -1948946786:
                case -1065017300:
                    C2485.m8357();
                    return 0;
                case -1863876489:
                case 476574566:
                    if (C4238.f15451 >= 0) {
                        iM2761 = C0619.m2761("֨ۗ") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-3563)) ^ 1330349174;
                        i12 = -1690221356;
                    } else {
                        iM2761 = C0773.m3169("ۨۛ") ^ i9;
                        i11 = ((iM2761 ^ i10) * (-20223)) ^ 254882141;
                        i12 = -76319967;
                    }
                    break;
                case -1850630899:
                case -1367016010:
                    parcelableExtra = intent.getParcelableExtra(C2288.m7761(sArr, i6, i7, i5));
                    if (C1826.m6301() >= 0) {
                        iM2761 = (i10 - C0773.m3169("ܺۡ")) * (-57);
                        i11 = ((iM2761 ^ i9) * 14809) ^ 2038935655;
                        i12 = -239301225;
                    } else {
                        iM2761 = (C0619.m2761("ۜ֡") ^ i9) * 23;
                        i11 = ((iM2761 ^ i10) * 3875) ^ 1272225297;
                        i12 = 1041601753;
                    }
                    break;
                case -1785143780:
                case -174265197:
                    C3690.m11987();
                    if (C2485.f7950 != 0) {
                        iM2761 = (i9 - C0619.m2761("ܶ᩺")) * (-99);
                        i11 = ((iM2761 ^ i10) * (-20185)) ^ (-1512023061);
                        i12 = 1024207395;
                    } else {
                        iM2761 = (i10 - C0619.m2761("۫ܰ")) * (-85);
                        i11 = ((iM2761 ^ i9) * (-28315)) ^ 705754188;
                        i12 = 1600749716;
                    }
                    break;
                case -1575588719:
                case 277627372:
                    i3 = s * 12216;
                    i4 = s * s;
                    if (C23916.m53419() != 0) {
                        iM2761 = (i10 - C0619.m2761("۫ܰ")) * (-85);
                        i11 = ((iM2761 ^ i9) * (-28315)) ^ 705754188;
                        i12 = 1600749716;
                    } else {
                        iM2761 = C0619.m2761("ܿ᩷") ^ i9;
                        i11 = ((iM2761 ^ i10) * (-3291)) ^ 1298269492;
                        i12 = 276114942;
                    }
                    break;
                case -1566608213:
                case -134173651:
                    C11235.m28309();
                    iM2761 = (i10 - C0619.m2761("۫ܰ")) * (-85);
                    i11 = ((iM2761 ^ i9) * (-28315)) ^ 705754188;
                    i12 = 1600749716;
                    break;
                case -1448293450:
                case -709923805:
                    this.f33992 = (Intent) parcelableExtra;
                    m27288();
                    return 2;
                case -1307414530:
                case 308046783:
                    if (C2834.f9334 <= 0) {
                        iM2761 = (i10 - C0773.m3169("ܺۡ")) * (-57);
                        i11 = ((iM2761 ^ i9) * 14809) ^ 2038935655;
                        i12 = -239301225;
                    } else {
                        iM2761 = (i10 - C0619.m2761("᩻۟")) * (-65);
                        i11 = ((iM2761 ^ i9) * (-993)) ^ 1835836321;
                        i12 = -297970;
                    }
                    break;
                case -1203601443:
                case 1592738888:
                    i5 = 41715;
                    iM2761 = C0773.m3169("ܿ᩹") ^ i9;
                    i11 = ((iM2761 ^ i10) * (-31937)) ^ (-370992459);
                    i12 = -2016071912;
                    break;
                case -1188931912:
                case -672136959:
                    if (C2310.m7813() <= 0) {
                        iM2761 = (i10 - C0619.m2761("۫ܰ")) * (-85);
                        i11 = ((iM2761 ^ i9) * (-28315)) ^ 705754188;
                        i12 = 1600749716;
                    } else {
                        iM2761 = (C0773.m3169("ܺ֡") ^ i10) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i11 = ((iM2761 ^ i9) * 3579) ^ (-1238571458);
                        i12 = 402909257;
                    }
                    break;
                case -913994354:
                case 106837816:
                    if (AbstractC3624.f12429 > 0) {
                        iM2761 = (i9 - C0619.m2761("ܺ֨")) * 75;
                        i11 = ((iM2761 ^ i10) * (-21347)) ^ (-1880466054);
                        i12 = 479312331;
                    } else {
                        iM2761 = (i9 - C0619.m2761("ܶ᩺")) * (-99);
                        i11 = ((iM2761 ^ i10) * (-20185)) ^ (-1512023061);
                        i12 = 1024207395;
                    }
                    break;
                case -827059154:
                case 1871975376:
                    sArr = f33972;
                    i6 = 1;
                    i7 = 4;
                    if (C2310.m7813() <= 0) {
                        iM2761 = (i10 - C0773.m3169("ܺۡ")) * (-57);
                        i11 = ((iM2761 ^ i9) * 14809) ^ 2038935655;
                        i12 = -239301225;
                    } else {
                        iM2761 = C0619.m2761("᩹᩵") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-31287)) ^ (-1670875280);
                        i12 = 865630057;
                    }
                    break;
                case -465862065:
                case -167984419:
                    if (C2966.m9664()) {
                        iM2761 = (C0619.m2761("ۨᩴ") ^ i9) * (-87);
                        i11 = ((iM2761 ^ i10) * (-30093)) ^ 1133619648;
                        i12 = -670533471;
                    } else {
                        iM2761 = (i10 - C0619.m2761("۫ܰ")) * (-85);
                        i11 = ((iM2761 ^ i9) * (-28315)) ^ 705754188;
                        i12 = 1600749716;
                    }
                    break;
                case 15396073:
                case 1369709173:
                    if (C2702.f8586 <= 0) {
                        iM2761 = (i10 - C0619.m2761("۫ܰ")) * (-85);
                        i11 = ((iM2761 ^ i9) * (-28315)) ^ 705754188;
                        i12 = 1600749716;
                    } else {
                        iM2761 = (C0619.m2761("ۤۛ") + i10) * 45;
                        i11 = ((iM2761 ^ i9) * (-26471)) ^ (-1827539201);
                        i12 = -2099546284;
                    }
                    break;
                case 387470974:
                case 1676786465:
                    if (!C0619.f2439) {
                        iM2761 = (i10 - C0773.m3169("ܺۡ")) * (-57);
                        i11 = ((iM2761 ^ i9) * 14809) ^ 2038935655;
                        i12 = -239301225;
                    } else {
                        iM2761 = (i10 - C0619.m2761("۫ܰ")) * (-85);
                        i11 = ((iM2761 ^ i9) * (-28315)) ^ 705754188;
                        i12 = 1600749716;
                    }
                    break;
                case 802563067:
                case 947708693:
                    if (C2878.m9491() <= 0) {
                        iM2761 = (i9 - C0619.m2761("ܺ֨")) * 75;
                        i11 = ((iM2761 ^ i10) * (-21347)) ^ (-1880466054);
                        i12 = 479312331;
                    } else {
                        iM2761 = C0619.m2761("ܿᩴ") ^ i9;
                        i11 = ((iM2761 ^ i10) * 14817) ^ 410102883;
                        i12 = 2103701063;
                    }
                    break;
                case 1461607757:
                case 1494488778:
                    if ((37307664 + i4) - i3 >= 0) {
                        iM2761 = C0773.m3169("ܶۚ") ^ i10;
                        i11 = ((iM2761 ^ i9) * 14703) ^ 735424181;
                        i12 = 1457373235;
                    } else {
                        iM2761 = (C0619.m2761("֨۟") ^ i9) * (-103);
                        i11 = ((iM2761 ^ i10) * 19059) ^ 956908853;
                        i12 = 656818027;
                    }
                    break;
                default:
                    s = f33972[0];
                    if (C2023.f6737) {
                        iM2761 = C0619.m2761("֨ۗ") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-3563)) ^ 1330349174;
                        i12 = -1690221356;
                    } else {
                        iM2761 = C0773.m3169("᩶ۚ") ^ i10;
                        i11 = ((iM2761 ^ i9) * 27895) ^ 1775178912;
                        i12 = -1919893749;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m27292(final AbstractActivityC17204 abstractActivityC17204) {
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        C1255 c1255 = (C1255) viewM40395.findViewById(R.id.MT_Protector);
        C1255 c1256 = (C1255) viewM40395.findViewById(R.id.MT_Protector);
        Spinner spinner = (Spinner) viewM40395.findViewById(R.id.spinner1);
        Spinner spinner2 = (Spinner) viewM40395.findViewById(R.id.spinner2);
        Spinner spinner3 = (Spinner) viewM40395.findViewById(R.id.MT_Protector);
        spinner.setAdapter((SpinnerAdapter) new C3054(abstractActivityC17204, abstractActivityC17204.getResources().getStringArray(R.array.MT_Protector)));
        spinner2.setAdapter((SpinnerAdapter) new C3054(abstractActivityC17204, abstractActivityC17204.getResources().getStringArray(R.array.MT_Protector)));
        spinner3.setAdapter((SpinnerAdapter) new C3054(abstractActivityC17204, abstractActivityC17204.getResources().getStringArray(R.array.MT_Protector)));
        c1255.setChecked(C22637.m51031());
        c1256.setChecked(C22637.m51027());
        spinner.setSelection(C22637.m51038());
        spinner2.setSelection(C22637.m51039());
        spinner3.setSelection(C22637.m51032());
        c1255.setOnCheckedChangeListener(new C1051());
        c1256.setOnCheckedChangeListener(new C19879(1));
        spinner.setOnItemSelectedListener(new C7017(new C4034()));
        spinner2.setOnItemSelectedListener(new C7017(new C14474()));
        spinner3.setOnItemSelectedListener(new C7017(new C21188()));
        DialogInterfaceC8327[] dialogInterfaceC8327Arr = new DialogInterfaceC8327[1];
        viewM40395.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2542(new C9253(dialogInterfaceC8327Arr)));
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8005(viewM40395);
        DialogInterfaceC8327 dialogInterfaceC8327M34866 = C14442.m34866(c2361BuildDialog, f33973 ? R.string.MT_Protector : R.string.MT_Protector, null, R.string.MT_Protector, null);
        dialogInterfaceC8327Arr[0] = dialogInterfaceC8327M34866;
        if (abstractActivityC17204 instanceof ActivityC3698) {
            dialogInterfaceC8327M34866.m22426(new DialogInterface.OnDismissListener() { // from class: l.ܿ۠ᩴ
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    int i = ServiceC10702.f33975;
                    abstractActivityC17204.finish();
                }
            });
        }
        dialogInterfaceC8327M34866.m22436().setOnClickListener(new ViewOnClickListenerC0305(abstractActivityC17204, 0));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27276(AbstractActivityC17204 abstractActivityC17204) {
        if (f33973) {
            C21576.m49084().stopService(new Intent(C21576.m49084(), (Class<?>) ServiceC10702.class));
            return;
        }
        if (!C7756.m21107(abstractActivityC17204)) {
            try {
                C7543.m20612(abstractActivityC17204, null);
                return;
            } catch (Throwable th) {
                abstractActivityC17204.m40401(th, (DialogInterface.OnDismissListener) null);
                return;
            }
        }
        if (abstractActivityC17204 instanceof Main) {
            ((Main) abstractActivityC17204).m120();
        } else {
            if (abstractActivityC17204 instanceof ActivityC3698) {
                ((ActivityC3698) abstractActivityC17204).m12018();
                return;
            }
            throw new RuntimeException();
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f33977 = getResources().getConfiguration().orientation;
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(new NotificationChannel("MT_COLOR_PICKER", getString(R.string.MT_Protector), 3));
        }
        Intent intent = new Intent(this, (Class<?>) Main.class);
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 67108864);
        C3558 c3558 = new C3558(this, "MT_COLOR_PICKER");
        c3558.m11599();
        c3558.m11594(C21576.m49088(R.string.MT_Protector));
        c3558.m11591(activity);
        c3558.m11597();
        c3558.m11596(false);
        startForeground(1001, c3558.m11589());
        this.f33976 = (C16257) LayoutInflater.from(this).inflate(R.layout.MT_Protector, (ViewGroup) null);
        this.f33981 = (C16257) LayoutInflater.from(this).inflate(R.layout.MT_Protector, (ViewGroup) null);
        this.f33980 = (C20442) this.f33976.getChildAt(0);
        C24172 c24172 = (C24172) this.f33981.getChildAt(0);
        this.f33986 = c24172;
        c24172.m54147((TextView) this.f33981.findViewById(R.id.MT_Protector));
        this.f33976.m38588();
        int[] iArr = new int[2];
        this.f33976.m38584(new C4737(this, iArr));
        this.f33976.m38585(new C9085(this, iArr));
        int iM51037 = C22637.m51037();
        for (int i = 0; i < 2; i++) {
            View childAt = this.f33981.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            layoutParams.height = iM51037;
            layoutParams.width = iM51037;
            childAt.setLayoutParams(layoutParams);
        }
        this.f33981.setOnClickListener(new ViewOnClickListenerC15533(3, this));
        this.f33981.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ᩳ۠ᩴ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                ServiceC10702 serviceC10702 = this.f61457;
                return serviceC10702.f33986.m54148(serviceC10702.f33981.m38589(), serviceC10702.f33981.m38587());
            }
        });
        this.f33981.m38588();
        Point point = new Point();
        this.f33981.m38584(new C21891(this, point));
        this.f33981.m38585(new C6849(this, point));
        f33973 = true;
        C21576.m49065(new Intent("ScreenColorPicker.ACTION_START"));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("ScreenColorPickerConfig.ACTION_CONFIG_CHANGED");
        C21576.m49064(this.f33987, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public void m27288() {
        Runnable[] runnableArr = {null};
        runnableArr[0] = new RunnableC16899(1, this);
        if (this.f33976.isAttachedToWindow()) {
            m27283();
            C21576.m49069(runnableArr[0], 15L);
        } else {
            runnableArr[0].run();
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static void m27282(ServiceC10702 serviceC10702) {
        int dimension;
        Display defaultDisplay = ((WindowManager) serviceC10702.getApplicationContext().getSystemService("window")).getDefaultDisplay();
        defaultDisplay.getSize(serviceC10702.f33993);
        Point point = serviceC10702.f33985;
        defaultDisplay.getRealSize(point);
        C20442 c20442 = serviceC10702.f33980;
        if (c20442 == null || (dimension = c20442.getWidth()) <= 0) {
            dimension = (int) serviceC10702.getResources().getDimension(R.dimen.MT_Protector);
        }
        int i = dimension / 2;
        serviceC10702.f33976.m38582((point.x / 2) - i, (point.y / 2) - i);
        serviceC10702.f33976.m38583(new C9999(serviceC10702));
        serviceC10702.f33976.mo38581();
        serviceC10702.m27279();
        C21576.m49062(500L, new RunnableC4773(4, serviceC10702));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m27274(ServiceC10702 serviceC10702, Point point, float f, float f2) {
        float fM51042 = C22637.m51042();
        serviceC10702.m27271(point.x + ((int) (f / fM51042)), point.y + ((int) (f2 / fM51042)));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m27279() {
        int i = getResources().getDisplayMetrics().densityDpi;
        this.f33989 = ((MediaProjectionManager) getApplicationContext().getSystemService("media_projection")).getMediaProjection(-1, this.f33992);
        Point point = this.f33985;
        ImageReader imageReaderNewInstance = ImageReader.newInstance(point.x, point.y, 1, 1);
        this.f33988 = imageReaderNewInstance;
        this.f33990 = this.f33989.createVirtualDisplay("MT_COLOR_PICKER", point.x, point.y, i, 16, imageReaderNewInstance.getSurface(), null, null);
        this.f33991 = false;
        this.f33988.setOnImageAvailableListener(this, f33974);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m27290() {
        VirtualDisplay virtualDisplay = this.f33990;
        if (virtualDisplay != null) {
            virtualDisplay.release();
            this.f33990 = null;
        }
        ImageReader imageReader = this.f33988;
        if (imageReader != null) {
            imageReader.close();
            this.f33988 = null;
        }
        MediaProjection mediaProjection = this.f33989;
        if (mediaProjection != null) {
            mediaProjection.stop();
            this.f33989 = null;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m27283() {
        m27290();
        C16257 c16257 = this.f33976;
        if (c16257 != null) {
            c16257.mo38590();
        }
        C16257 c16258 = this.f33981;
        if (c16258 != null) {
            c16258.mo38590();
        }
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = this.f33977;
        int i2 = configuration.orientation;
        if (i != i2) {
            this.f33977 = i2;
            m27283();
            C21576.m49069(new RunnableC2198(1, this), 50L);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        m27283();
        f33973 = false;
        C21576.m49065(new Intent("ScreenColorPicker.ACTION_STOP"));
        int i = C22637.f73532;
        C21576.m49063(this.f33987);
        stopForeground(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m27271(int i, int i2) {
        int dimension;
        int iM51037;
        int i3;
        Point point = this.f33985;
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
        Rect rect = this.f33984;
        int i7 = -rect.left;
        int i8 = -rect.top;
        C20442 c20442 = this.f33980;
        if (c20442 == null || (dimension = c20442.getWidth()) <= 0) {
            dimension = (int) getResources().getDimension(R.dimen.MT_Protector);
        }
        C24172 c24172 = this.f33986;
        if (c24172 == null || (iM51037 = c24172.getWidth()) <= 0) {
            iM51037 = C22637.m51037();
        }
        this.f33978 = i;
        this.f33982 = i2;
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
        this.f33980.m46874(i3, i4);
        this.f33976.m38582(i10 + i7, i11 + i8);
        if (point.x < point.y) {
            int i18 = (i - (iM51037 / 2)) + i7;
            float f = i2;
            float f2 = iM51037;
            int i19 = ((int) (f - (1.5f * f2))) + i8;
            if (i19 <= 0) {
                i19 = ((int) ((f2 * 0.5f) + f)) + i8;
            }
            this.f33981.m38582(i18, i19);
            return;
        }
        int i20 = (i2 - (iM51037 / 2)) + i8;
        float f3 = i;
        float f4 = iM51037;
        int i21 = ((int) (f3 - (1.5f * f4))) + i7;
        if (i21 <= 0) {
            i21 = ((int) ((f4 * 0.5f) + f3)) + i7;
        }
        this.f33981.m38582(i21, i20);
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static void m27270(ServiceC10702 serviceC10702) {
        Rect rect = serviceC10702.f33984;
        int i = -rect.left;
        int i2 = -rect.top;
        int iM51037 = C22637.m51037();
        Point point = serviceC10702.f33985;
        if (point.x < point.y) {
            int i3 = (serviceC10702.f33978 - (iM51037 / 2)) + i;
            float f = serviceC10702.f33982;
            float f2 = iM51037;
            int i4 = ((int) (f - (1.5f * f2))) + i2;
            if (i4 <= 0) {
                i4 = ((int) ((f2 * 0.5f) + f)) + i2;
            }
            serviceC10702.f33981.m38582(i3, i4);
            return;
        }
        int i5 = (serviceC10702.f33982 - (iM51037 / 2)) + i2;
        float f3 = serviceC10702.f33978;
        float f4 = iM51037;
        int i6 = ((int) (f3 - (1.5f * f4))) + i;
        if (i6 <= 0) {
            i6 = ((int) ((f4 * 0.5f) + f3)) + i;
        }
        serviceC10702.f33981.m38582(i6, i5);
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        Image imageAcquireNextImage = imageReader.acquireNextImage();
        if (imageAcquireNextImage == null) {
            return;
        }
        if (!this.f33991) {
            this.f33991 = true;
        }
        this.f33976.getLocationOnScreen(this.f33983);
        int width = this.f33978;
        int height = this.f33982;
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
        int iM46872 = this.f33980.m46872();
        Rect rect = this.f33979;
        rect.set(width - iM46872, height - iM46872, width + iM46872 + 1, iM46872 + height + 1);
        C24172 c24172 = this.f33986;
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
        c24172.m54146(bitmapCreateBitmap, width, height);
        imageAcquireNextImage.close();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m27284(ServiceC10702 serviceC10702) {
        if (!f33973 || serviceC10702.f33991) {
            return;
        }
        C22673.m51160("Getting screen image timed out");
        serviceC10702.stopSelf();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m27289(ServiceC10702 serviceC10702) {
        if (!f33973 || serviceC10702.f33991) {
            return;
        }
        serviceC10702.m27290();
        serviceC10702.m27279();
        C21576.m49062(500L, new RunnableC0361(3, serviceC10702));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m27291(ServiceC10702 serviceC10702) {
        if (!f33973 || serviceC10702.f33991) {
            return;
        }
        serviceC10702.m27290();
        serviceC10702.m27279();
        C21576.m49062(500L, new RunnableC7763(0, serviceC10702));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m27293() {
        return f33973;
    }
}
