package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.۠ۧۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnClickListenerC8128 implements DialogInterface.OnClickListener, View.OnClickListener {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static WeakReference f28452;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f28455;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f28457;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C11545 f28458;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C18310 f28459;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC19356 f28460;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f28461;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C16674 f28462;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public View f28463;

    /* JADX INFO: renamed from: ᩹۫᩸, reason: not valid java name and contains not printable characters */
    private static final short[] f28453 = {3114, -31897, -31873, -31917, -31890, -31891, -31902, -31917, -31876, -31897, -31873, -31968, -31905, -31901, -31874, -31874, -31883, -31968, -31956, -31880, -31900, -31899, -31873, -31956, -31894, -31879, -31902, -31889, -31880, -31899, -31901, -31902, -31956, -31899, -31873, -31956, -31902, -31901, -31880, -31956, -31873, -31879, -31876, -31876, -31901, -31874, -31880, -31895, -31896, -31956, -31894, -31901, -31874, -31956, -31880, -31900, -31899, -31873, -31956, -31891, -31876, -31876, -31956, -31891, -31880, -31956, -31880, -31900, -31895, -31956, -31903, -31901, -31903, -31895, -31902, -31880, -31955, -9084, -7747, -6075, 31744, -6770, -6406, -13055, -6621, -8179, -9995, 2281, -8808, -2524, -13197, -2524, -12105, -1934, -11885, 1009, 31757};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f28450 = new AtomicInteger();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static boolean f28451 = true;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AtomicBoolean f28454 = new AtomicBoolean();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f28456 = true;

    public DialogInterfaceOnClickListenerC8128(final C11545 c11545, String str) {
        this.f28458 = c11545;
        this.f28457 = C5553.m15313(str, new String[0]);
        final int iIncrementAndGet = f28450.incrementAndGet();
        final C17485 c17485 = new C17485(c11545.m28824(), R.string.MT_Protector);
        C4716.f16636.execute(new Runnable() { // from class: l.ܳۛۚ
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnClickListenerC8128.m21408(this.f46957, c17485, iIncrementAndGet, c11545);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21408(final DialogInterfaceOnClickListenerC8128 dialogInterfaceOnClickListenerC8128, final C17485 c17485, final int i, final C11545 c11545) {
        C16737.m39267(300L, new RunnableC9395(0, dialogInterfaceOnClickListenerC8128, c17485));
        AbstractC20745 abstractC20745 = dialogInterfaceOnClickListenerC8128.f28457;
        C18310 c18310M43738 = C19016.m43738(abstractC20745);
        dialogInterfaceOnClickListenerC8128.f28459 = c18310M43738;
        String strM45746 = null;
        if (c18310M43738 == null) {
            try {
                C2455 c2455 = new C2455(abstractC20745);
                try {
                    strM45746 = C20240.m45746(c2455);
                    c2455.close();
                } catch (Throwable th) {
                    try {
                        c2455.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused) {
            }
        }
        final String str = strM45746;
        dialogInterfaceOnClickListenerC8128.f28456 = false;
        C16737.m39273(new Runnable() { // from class: l.ۗۛۚ
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnClickListenerC8128.m21407(this.f11400, c17485, i, str, c11545);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21406(DialogInterfaceOnClickListenerC8128 dialogInterfaceOnClickListenerC8128, C17485 c17485) {
        if (dialogInterfaceOnClickListenerC8128.f28456) {
            c17485.m40697(new RunnableC22090(1, c17485));
            c17485.m40704();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21411(C17485 c17485) {
        f28450.incrementAndGet();
        c17485.m40694();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [l.ܿۛۚ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21407(final DialogInterfaceOnClickListenerC8128 dialogInterfaceOnClickListenerC8128, C17485 c17485, int i, final String str, final C11545 c11545) {
        DialogInterfaceC19356 dialogInterfaceC19356;
        AbstractC20745 abstractC20745 = dialogInterfaceOnClickListenerC8128.f28457;
        c17485.m40694();
        if (i != f28450.get()) {
            return;
        }
        if (dialogInterfaceOnClickListenerC8128.f28459 == null) {
            if (str == null) {
                C8265.m21682(c11545, abstractC20745);
                return;
            }
            String[] strArr = {C16737.m39288(R.string.MT_Protector), C16737.m39288(R.string.MT_Protector)};
            C8067 c8067BuildDialog = c11545.m28824().buildDialog();
            c8067BuildDialog.m21266(strArr, -1, new DialogInterface.OnClickListener() { // from class: l.ۙۧۚ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    DialogInterfaceOnClickListenerC8128.m21404(this.f16276, c11545, str, dialogInterface, i2);
                }
            });
            c8067BuildDialog.m21274(R.string.MT_Protector);
            c8067BuildDialog.m21269();
            return;
        }
        final Main mainM28824 = c11545.m28824();
        View viewM30995 = mainM28824.m30995(R.layout.MT_Protector);
        dialogInterfaceOnClickListenerC8128.f28463 = viewM30995;
        ImageView imageView = (ImageView) viewM30995.findViewById(R.id.icon);
        imageView.setImageDrawable(dialogInterfaceOnClickListenerC8128.f28459.m42526());
        imageView.setOnClickListener(new ViewOnClickListenerC22922(1, dialogInterfaceOnClickListenerC8128));
        ViewOnClickListenerC22523.m50035((TextView) dialogInterfaceOnClickListenerC8128.f28463.findViewById(R.id.MT_Protector), dialogInterfaceOnClickListenerC8128.f28459.m42532());
        ViewOnClickListenerC22523.m50035((TextView) dialogInterfaceOnClickListenerC8128.f28463.findViewById(R.id.MT_Protector), dialogInterfaceOnClickListenerC8128.f28459.m42535());
        ViewOnClickListenerC22523.m50035((TextView) dialogInterfaceOnClickListenerC8128.f28463.findViewById(R.id.MT_Protector), dialogInterfaceOnClickListenerC8128.f28459.m42531());
        ViewOnClickListenerC22523.m50035((TextView) dialogInterfaceOnClickListenerC8128.f28463.findViewById(R.id.MT_Protector), String.valueOf(dialogInterfaceOnClickListenerC8128.f28459.m42528()));
        ViewOnClickListenerC22523.m50035((TextView) dialogInterfaceOnClickListenerC8128.f28463.findViewById(R.id.MT_Protector), C1791.m5863(dialogInterfaceOnClickListenerC8128.f28459.m42527()));
        ViewOnClickListenerC22523.m50035((TextView) dialogInterfaceOnClickListenerC8128.f28463.findViewById(R.id.MT_Protector), C8703.m22528(dialogInterfaceOnClickListenerC8128.f28459.m42533()));
        ViewOnClickListenerC22523.m50035((TextView) dialogInterfaceOnClickListenerC8128.f28463.findViewById(R.id.MT_Protector), C8703.m22528(dialogInterfaceOnClickListenerC8128.f28459.m42530()));
        TextView textView = (TextView) dialogInterfaceOnClickListenerC8128.f28463.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) dialogInterfaceOnClickListenerC8128.f28463.findViewById(R.id.signature);
        View viewFindViewById = dialogInterfaceOnClickListenerC8128.f28463.findViewById(R.id.MT_Protector);
        ViewOnClickListenerC22523.m50034(textView);
        dialogInterfaceOnClickListenerC8128.m21417();
        C8067 c8067BuildDialog2 = mainM28824.buildDialog();
        c8067BuildDialog2.m21258(dialogInterfaceOnClickListenerC8128.f28463);
        c8067BuildDialog2.m21251(R.string.MT_Protector, null);
        c8067BuildDialog2.m21275(R.string.MT_Protector, dialogInterfaceOnClickListenerC8128);
        if (c11545.m28814("local")) {
            c8067BuildDialog2.m21271(R.string.MT_Protector, dialogInterfaceOnClickListenerC8128);
        }
        WeakReference weakReference = f28452;
        if (weakReference != null && (dialogInterfaceC19356 = (DialogInterfaceC19356) weakReference.get()) != null && dialogInterfaceC19356.m44375()) {
            dialogInterfaceC19356.dismiss();
        }
        dialogInterfaceOnClickListenerC8128.f28460 = c8067BuildDialog2.m21269();
        f28452 = new WeakReference(dialogInterfaceOnClickListenerC8128.f28460);
        final long jM33714 = C13872.m33714(abstractC20745.mo24643());
        Button buttonM44361 = dialogInterfaceOnClickListenerC8128.f28460.m44361();
        dialogInterfaceOnClickListenerC8128.f28460.m44373().setOnClickListener(new ViewOnClickListenerC13773(0, dialogInterfaceOnClickListenerC8128));
        dialogInterfaceOnClickListenerC8128.f28460.m44373().setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ۨۧۚ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                C17901.m41533(c11545, this.f39183.f28457);
                return true;
            }
        });
        buttonM44361.setOnClickListener(dialogInterfaceOnClickListenerC8128);
        final C18711 c18711 = new C18711(dialogInterfaceOnClickListenerC8128);
        mainM28824.getLifecycle().mo9171(c18711);
        final C21843 c21843M48614 = C21843.m48614(mainM28824);
        final C18005 c18005 = new C18005(dialogInterfaceOnClickListenerC8128);
        c21843M48614.m48617(c18005, new IntentFilter("bin.mt.plus.ACTION_INSTALL_FAILED_DOWNGRADE"));
        dialogInterfaceOnClickListenerC8128.f28460.m44367(new DialogInterface.OnDismissListener() { // from class: l.ۖۧۚ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C13872.m33716(jM33714);
                mainM28824.getLifecycle().mo9172(c18711);
                c21843M48614.m48616(c18005);
            }
        });
        C3872.f14473.m44959(dialogInterfaceOnClickListenerC8128.f28460, new C16450(0, dialogInterfaceOnClickListenerC8128));
        C4716.f16636.execute(new RunnableC12217(0, dialogInterfaceOnClickListenerC8128, textView));
        C7282.m19419(textView2, viewFindViewById, dialogInterfaceOnClickListenerC8128.f28457, mainM28824, true, new InterfaceC17295() { // from class: l.ܿۛۚ
            @Override // l.InterfaceC17295
            public final void accept(Object obj) {
                this.f54718.f28462 = (C16674) obj;
            }
        }, new InterfaceC5614() { // from class: l.ۛۛۚ
            @Override // l.InterfaceC5614
            /* JADX INFO: renamed from: ֨ */
            public final boolean mo2357() {
                return DialogInterfaceOnClickListenerC8128.m21422(this.f20021);
            }
        }, dialogInterfaceOnClickListenerC8128.f28454);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21404(DialogInterfaceOnClickListenerC8128 dialogInterfaceOnClickListenerC8128, C11545 c11545, String str, DialogInterface dialogInterface, int i) {
        AbstractC20745 abstractC20745 = dialogInterfaceOnClickListenerC8128.f28457;
        dialogInterface.dismiss();
        if (i == 0) {
            C8265.m21682(c11545, abstractC20745);
        } else {
            m21410(c11545, abstractC20745, str, (RunnableC3787) null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21402(DialogInterfaceOnClickListenerC8128 dialogInterfaceOnClickListenerC8128, TextView textView) {
        try {
            String strM23463 = C9139.m23463(dialogInterfaceOnClickListenerC8128.f28457);
            if (dialogInterfaceOnClickListenerC8128.f28460.m44375()) {
                C16737.m39273(new RunnableC23506(0, textView, strM23463));
            }
        } catch (Throwable unused) {
            if (dialogInterfaceOnClickListenerC8128.f28460.m44375()) {
                C16737.m39273(new RunnableC7361(2, textView));
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m21422(DialogInterfaceOnClickListenerC8128 dialogInterfaceOnClickListenerC8128) {
        return !dialogInterfaceOnClickListenerC8128.f28460.m44375();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m21394(final DialogInterfaceOnClickListenerC8128 dialogInterfaceOnClickListenerC8128) {
        CharSequence[] charSequenceArr = {C16737.m39288(R.string.MT_Protector), C16737.m39288(R.string.MT_Protector), C16737.m39288(R.string.MT_Protector)};
        C8067 c8067BuildDialog = dialogInterfaceOnClickListenerC8128.f28458.m28824().buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21266(charSequenceArr, -1, new DialogInterface.OnClickListener() { // from class: l.ۧۛۚ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                DialogInterfaceOnClickListenerC8128.m21400(this.f36818, dialogInterface, i);
            }
        });
        c8067BuildDialog.m21269();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21400(DialogInterfaceOnClickListenerC8128 dialogInterfaceOnClickListenerC8128, DialogInterface dialogInterface, int i) {
        C11545 c11545 = dialogInterfaceOnClickListenerC8128.f28458;
        dialogInterface.dismiss();
        if (i == 0) {
            new C5305(dialogInterfaceOnClickListenerC8128, c11545.m28771(dialogInterfaceOnClickListenerC8128.f28459.m42532() + "_icon.zip", false)).m10243();
            return;
        }
        if (i == 1 || i == 2) {
            new C22239(dialogInterfaceOnClickListenerC8128, c11545.m28771(dialogInterfaceOnClickListenerC8128.f28459.m42532() + "_icon" + new String[]{".png", ".webp"}[i - 1], false), i).m10243();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m21396(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int iM33769 = C13932.m33769(200.0f);
        if (intrinsicWidth < iM33769) {
            intrinsicHeight = (int) (intrinsicHeight * (iM33769 / intrinsicWidth));
            intrinsicWidth = iM33769;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect rectCopyBounds = drawable.copyBounds();
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        drawable.setBounds(rectCopyBounds);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21398(C2455 c2455, C22918 c22918, C6037 c6037, int i, boolean z, C22785 c22785) {
        C12107 entry;
        for (InterfaceC3609 interfaceC3609 : c6037.m16367(i)) {
            if (z) {
                InterfaceC17721 interfaceC17721Mo10692 = interfaceC3609.mo10692();
                InterfaceC19133 type = interfaceC3609.getType();
                InterfaceC12783 interfaceC12783Mo10690 = interfaceC3609.mo10690();
                C7262 c7262M50439 = c22785.m50439(interfaceC17721Mo10692.mo19106(), interfaceC17721Mo10692.getPackageName());
                c7262M50439.m19388(interfaceC17721Mo10692.mo19107());
                C0206 c0206M19392 = c7262M50439.m19392(type.mo26942(), type.getTypeName());
                C21373 c21373M1523 = c0206M19392.m1523(interfaceC12783Mo10690.mo31747());
                c0206M19392.m1526(interfaceC3609.mo10691(), interfaceC3609.mo7645(), false);
                c21373M1523.m47902(interfaceC3609.mo10691()).m42940(interfaceC3609);
            }
            if (!interfaceC3609.mo7644()) {
                InterfaceC9961 value = interfaceC3609.getValue();
                if (value.mo25185() && (entry = c2455.getEntry(value.mo25187().getValue())) != null) {
                    c22918.m50728(entry, c2455);
                    try {
                        XmlResourceParserC11068 xmlResourceParserC11068M47106 = C20945.m47103(c2455.m7475(entry, (C8516) null)).m47106();
                        while (true) {
                            int next = xmlResourceParserC11068M47106.next();
                            if (next != 1) {
                                if (next == 2) {
                                    int attributeCount = xmlResourceParserC11068M47106.getAttributeCount();
                                    for (int i2 = 0; i2 < attributeCount; i2++) {
                                        if (xmlResourceParserC11068M47106.m27894(i2) == 1) {
                                            m21398(c2455, c22918, c6037, xmlResourceParserC11068M47106.m27896(i2), true, c22785);
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void m21417() {
        int i;
        PackageInfo packageInfo;
        long j;
        int i2;
        String str;
        String str2;
        String str3;
        long j2;
        int i3;
        float f;
        boolean z = this.f28461;
        if (z) {
            this.f28461 = false;
        }
        PackageManager packageManagerM39292 = C16737.m39292();
        String strMo33986 = null;
        try {
            Iterator<PackageInfo> it = packageManagerM39292.getInstalledPackages(0).iterator();
            i = 0;
            do {
                try {
                    if (!it.hasNext()) {
                        packageInfo = null;
                        break;
                    } else {
                        packageInfo = it.next();
                        if ((packageInfo.applicationInfo.flags & 129) == 0) {
                            i++;
                        }
                    }
                } catch (Throwable unused) {
                }
            } while (!packageInfo.packageName.equals(this.f28459.m42535()));
        } catch (Throwable unused2) {
            i = 0;
        }
        if (packageInfo == null && i <= 1) {
            try {
                packageInfo = packageManagerM39292.getPackageInfo(this.f28459.m42535(), 0);
            } catch (Throwable unused3) {
            }
        }
        if (packageInfo != null) {
            String str4 = packageInfo.versionName;
            int i4 = packageInfo.versionCode;
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            String str5 = applicationInfo.sourceDir;
            str3 = applicationInfo.dataDir;
            AbstractC20745 abstractC20745M46690 = C11904.f39934.m46690("Android/data/" + packageInfo.packageName);
            if (abstractC20745M46690.mo33974()) {
                strMo33986 = abstractC20745M46690.mo33986();
            } else if (Build.VERSION.SDK_INT >= 34 && !C19812.m45045().mo43869() && (packageInfo.applicationInfo.flags & 129) == 0) {
                strMo33986 = abstractC20745M46690.mo33986();
            }
            i2 = packageInfo.applicationInfo.uid;
            j = packageInfo.firstInstallTime;
            j2 = packageInfo.lastUpdateTime;
            i3 = i4;
            str2 = str4;
            str = strMo33986;
            strMo33986 = str5;
        } else {
            j = 0;
            i2 = 0;
            str = null;
            str2 = null;
            str3 = null;
            j2 = 0;
            i3 = 0;
        }
        if (strMo33986 != null && this.f28463.findViewById(R.id.MT_Protector).getVisibility() == 0 && ((TextView) this.f28463.findViewById(R.id.apkPath)).getText().toString().equals(strMo33986)) {
            return;
        }
        if (strMo33986 != null) {
            this.f28463.findViewById(R.id.MT_Protector).setVisibility(0);
            this.f28463.findViewById(R.id.MT_Protector).setVisibility(0);
            this.f28463.findViewById(R.id.MT_Protector).setVisibility(0);
            if (str3 != null) {
                this.f28463.findViewById(R.id.MT_Protector).setVisibility(0);
                TextView textView = (TextView) this.f28463.findViewById(R.id.dataDirectory);
                SpannableString spannableString = new SpannableString(str3);
                spannableString.setSpan(new AbsoluteSizeSpan(C13932.m33770(13.0f)), 0, spannableString.length(), 17);
                textView.setText(spannableString);
                ViewOnClickListenerC22523.m50036(textView);
                textView.setOnClickListener(this);
                f = 13.0f;
            } else {
                f = 13.0f;
                this.f28463.findViewById(R.id.MT_Protector).setVisibility(8);
            }
            if (str != null) {
                this.f28463.findViewById(R.id.MT_Protector).setVisibility(0);
                ((TextView) this.f28463.findViewById(R.id.textView6)).setText(C16737.m39288(R.string.MT_Protector).concat(" 1"));
                ((TextView) this.f28463.findViewById(R.id.textView10)).setText(C16737.m39288(R.string.MT_Protector).concat(" 2"));
                TextView textView2 = (TextView) this.f28463.findViewById(R.id.dataDirectory2);
                SpannableString spannableString2 = new SpannableString(str);
                spannableString2.setSpan(new AbsoluteSizeSpan(C13932.m33770(f)), 0, spannableString2.length(), 17);
                textView2.setText(spannableString2);
                ViewOnClickListenerC22523.m50036(textView2);
                textView2.setOnClickListener(this);
            } else {
                this.f28463.findViewById(R.id.MT_Protector).setVisibility(8);
            }
            ViewOnClickListenerC22523.m50035((TextView) this.f28463.findViewById(R.id.installedVersion), str2 + " (" + i3 + MotionUtils.EASING_TYPE_FORMAT_END);
            TextView textView3 = (TextView) this.f28463.findViewById(R.id.apkPath);
            SpannableString spannableString3 = new SpannableString(strMo33986);
            spannableString3.setSpan(new AbsoluteSizeSpan(C13932.m33770(f)), 0, spannableString3.length(), 17);
            textView3.setText(spannableString3);
            ViewOnClickListenerC22523.m50036(textView3);
            textView3.setOnClickListener(this);
            ViewOnClickListenerC22523.m50035((TextView) this.f28463.findViewById(R.id.uid), String.valueOf(i2));
            ViewOnClickListenerC22523.m50035((TextView) this.f28463.findViewById(R.id.firstInstall), C5319.m14744(j));
            ViewOnClickListenerC22523.m50035((TextView) this.f28463.findViewById(R.id.lastUpdate), C5319.m14744(j2));
            this.f28455 = ((long) i3) > this.f28459.m42528();
            return;
        }
        this.f28463.findViewById(R.id.MT_Protector).setVisibility(8);
        this.f28463.findViewById(R.id.MT_Protector).setVisibility(8);
        this.f28463.findViewById(R.id.MT_Protector).setVisibility(8);
        this.f28463.findViewById(R.id.MT_Protector).setVisibility(8);
        this.f28463.findViewById(R.id.MT_Protector).setVisibility(8);
        this.f28463.findViewById(R.id.MT_Protector).setVisibility(8);
        this.f28463.findViewById(R.id.MT_Protector).setVisibility(8);
        this.f28455 = false;
        if (z) {
            m21412(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:42:0x009f  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ae  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m21414(String str) {
        short[] sArr = f28453;
        if (RunnableC3388.f12514 >= 0) {
            C0817.m3399();
            if (RunnableC1606.m5473() == 0) {
                C3722.m10894();
            }
        } else {
            short s = sArr[0];
            if (C19806.f63586) {
                RunnableC1895.m6170();
                if (C1419.f5860 < 0) {
                    C3722.m10894();
                } else if (C2871.f10837 < 0) {
                    C0817.m3399();
                    if (RunnableC1606.m5473() == 0) {
                        C3722.m10894();
                    }
                }
            } else {
                int i = s + 1;
                if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                    int i2 = i * i;
                    int i3 = s * 2;
                    if (C2477.f9839 > 0) {
                        int i4 = i2 - (i3 + 1) >= 0 ? 33548 : 65069;
                        C8416 c8416M22053 = C8416.m22053();
                        short[] sArr2 = f28453;
                        if (C0278.m1789() <= 0) {
                            C3722.m10894();
                        } else if (C1377.m4833() != 0) {
                            C0817.m3399();
                            if (RunnableC1606.m5473() == 0) {
                                C3722.m10894();
                            }
                        } else {
                            String strM22055 = c8416M22053.m22055(C2124.m6685(sArr2, 1, 10, i4), "");
                            if (C2642.m8171() != 0) {
                                RunnableC1895.m6170();
                                if (C1419.f5860 < 0) {
                                    C3722.m10894();
                                }
                            } else {
                                short[] sArr3 = f28453;
                                if (C0629.f2722 > 0) {
                                    String strM8470 = C2788.m8470(sArr3, 11, 1, i4);
                                    if (C2249.f8050 >= 0) {
                                        C0817.m3399();
                                        if (RunnableC1606.m5473() == 0) {
                                            C3722.m10894();
                                        }
                                    } else {
                                        if (!Arrays.asList(C1460.m5056(strM22055, strM8470)).contains(str)) {
                                            return false;
                                        }
                                        if (C6730.m18173()) {
                                            C15829.m37619(C1377.m4832(f28453, 77, 20, i4));
                                            return true;
                                        }
                                        short[] sArr4 = f28453;
                                        if (C2788.m8472() == 0) {
                                            C15829.m37619(RunnableC1564.m5344(sArr4, 12, 65, i4));
                                            return true;
                                        }
                                    }
                                }
                            }
                            if (C2871.f10837 < 0) {
                                C0817.m3399();
                                if (RunnableC1606.m5473() == 0) {
                                    C3722.m10894();
                                }
                            }
                        }
                    } else if (C2871.f10837 < 0) {
                        C0817.m3399();
                        if (RunnableC1606.m5473() == 0) {
                            C3722.m10894();
                        }
                    }
                } else {
                    C0817.m3399();
                    if (RunnableC1606.m5473() == 0) {
                        C3722.m10894();
                    }
                }
            }
        }
        C1025.m3861();
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C8265.m21682(this.f28458, this.f28457);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21401(DialogInterfaceOnClickListenerC8128 dialogInterfaceOnClickListenerC8128, View view) {
        if (!ApplicationC0716.f2988.getBoolean("apk_installation_verify", true)) {
            dialogInterfaceOnClickListenerC8128.m21412(true);
            return;
        }
        C16674 c16674 = dialogInterfaceOnClickListenerC8128.f28462;
        if (c16674 != null && c16674.m39147() && !dialogInterfaceOnClickListenerC8128.f28462.m39142()) {
            C8067 c8067BuildDialog = dialogInterfaceOnClickListenerC8128.f28458.m28824().buildDialog();
            c8067BuildDialog.m21274(R.string.MT_Protector);
            c8067BuildDialog.m21253(R.string.MT_Protector);
            c8067BuildDialog.m21251(R.string.MT_Protector, null);
            c8067BuildDialog.m21271(R.string.MT_Protector, new DialogInterfaceOnClickListenerC12069(2, dialogInterfaceOnClickListenerC8128));
            C23250.m51307(c8067BuildDialog.m21269());
            return;
        }
        view.setEnabled(false);
        new C22945(dialogInterfaceOnClickListenerC8128, view).m10243();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m21412(boolean z) {
        int i = 0;
        if (z && !ApplicationC0716.f2988.getBoolean("apk_installation_confirm", false)) {
            z = false;
        }
        if (z) {
            boolean z2 = (!C3872.m11216() || C8416.m22053().m22056("disable_install_by_shizuku") || C3872.m11206() == 0) ? false : true;
            boolean zM11213 = C3872.m11213();
            if (!z2 && !zM11213) {
                z = false;
            }
        }
        AbstractC20745 abstractC20745 = this.f28457;
        C11545 c11545 = this.f28458;
        if (z) {
            C8067 c8067BuildDialog = c11545.m28824().buildDialog();
            c8067BuildDialog.m21274(R.string.MT_Protector);
            c8067BuildDialog.m21261(C16737.m39264(R.string.MT_Protector, abstractC20745.getName()));
            c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC0221(i, this));
            c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067BuildDialog.m21269();
            return;
        }
        C3872.m11210(c11545.m28824(), abstractC20745, this.f28459.m42535());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C18295 c18295M43718;
        C18295 c18295M43719;
        int id = view.getId();
        C11545 c11545 = this.f28458;
        if (id == R.id.dataDirectory) {
            this.f28460.dismiss();
            if (!C6696.m18084() && (c18295M43719 = C19001.m43718(this.f28459.m42535())) != null) {
                c11545.m28812(c18295M43719.m42503() + "/data", true);
                return;
            }
            c11545.m28812(((TextView) view).getText().toString(), true);
            return;
        }
        if (view.getId() == R.id.dataDirectory2) {
            this.f28460.dismiss();
            if (!C6696.m18084() && (c18295M43718 = C19001.m43718(this.f28459.m42535())) != null) {
                c11545.m28812(c18295M43718.m42503() + "/android_data", true);
                return;
            }
            c11545.m28812(((TextView) view).getText().toString(), true);
            return;
        }
        if (view.getId() == R.id.apkPath) {
            this.f28460.dismiss();
            File file = new File(((TextView) view).getText().toString());
            c11545.m28763(file.getName());
            c11545.m28812(file.getParent(), true);
            return;
        }
        String strM42535 = this.f28459.m42535();
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f28460;
        C13638.requireNonNull(dialogInterfaceC19356);
        m21410(c11545, this.f28457, strM42535, new RunnableC3787(3, dialogInterfaceC19356));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21410(final C11545 c11545, final AbstractC20745 abstractC20745, final String str, final RunnableC3787 runnableC3787) {
        boolean z = C16737.m39279().getBoolean(R.bool.MT_Protector);
        ViewOnClickListenerC16028 viewOnClickListenerC16028 = new ViewOnClickListenerC16028(c11545.m28824(), null);
        if (z) {
            viewOnClickListenerC16028.m38013(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC16028.m38013(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC16028.m38013(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC16028.m38013(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC16028.m38013(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC16028.m38013(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC16028.m38013(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC16028.m38013(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC16028.m38013(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC16028.m38013(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC16028.m38013(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC16028.m38013(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC16028.m38013(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC16028.m38013(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC16028.m38013(R.string.MT_Protector, R.string.MT_Protector);
        } else {
            viewOnClickListenerC16028.m38013(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC16028.m38013(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC16028.m38013(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC16028.m38013(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC16028.m38013(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC16028.m38013(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC16028.m38013(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC16028.m38013(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC16028.m38013(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC16028.m38013(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC16028.m38013(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC16028.m38013(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC16028.m38013(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC16028.m38013(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC16028.m38013(R.string.MT_Protector, R.string.MT_Protector);
        }
        viewOnClickListenerC16028.m38016(new InterfaceC20966() { // from class: l.֫ۛۚ
            @Override // l.InterfaceC20966
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final void mo5519(int i) {
                DialogInterfaceOnClickListenerC8128.m21397(str, runnableC3787, c11545, abstractC20745, i);
            }
        });
        if (z) {
            viewOnClickListenerC16028.m38018();
        } else {
            viewOnClickListenerC16028.m38017();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21397(String str, Runnable runnable, C11545 c11545, AbstractC20745 abstractC20745, int i) {
        if (i == R.string.MT_Protector && m21414(str)) {
            return;
        }
        if (runnable != null) {
            runnable.run();
        }
        if (i == R.string.MT_Protector) {
            C20874.m46911(c11545, new String[]{abstractC20745.mo33986()}, str, true, false);
            return;
        }
        if (i == R.string.MT_Protector) {
            C20874.m46916(abstractC20745, c11545, str);
            return;
        }
        if (i == R.string.MT_Protector) {
            C20874.m46917(abstractC20745, c11545, str);
            return;
        }
        if (i == R.string.MT_Protector) {
            C20874.m46921(abstractC20745, c11545, str);
            return;
        }
        if (i == R.string.MT_Protector) {
            C20874.m46912(abstractC20745, c11545, str);
            return;
        }
        if (i == R.string.MT_Protector) {
            C20874.m46907(abstractC20745, c11545, str);
            return;
        }
        if (i == R.string.MT_Protector) {
            C20874.m46919(abstractC20745, c11545, str);
            return;
        }
        if (i == R.string.MT_Protector) {
            C20874.m46920(abstractC20745, c11545, str);
            return;
        }
        if (i == R.string.MT_Protector) {
            if (!C1709.m5692()) {
                C15829.m37611(R.string.MT_Protector);
                return;
            } else {
                C20874.m46913(abstractC20745, c11545, str);
                return;
            }
        }
        if (i == R.string.MT_Protector) {
            C20874.m46908(abstractC20745, c11545, str);
            return;
        }
        if (i == R.string.MT_Protector) {
            C20874.m46909(abstractC20745, c11545, str);
            return;
        }
        if (i == R.string.MT_Protector) {
            C20874.m46914(abstractC20745, c11545, str);
            return;
        }
        if (i == R.string.MT_Protector) {
            C20874.m46915(abstractC20745, c11545, str);
            return;
        }
        if (i == R.string.MT_Protector) {
            C20874.m46918(abstractC20745, c11545, str);
            return;
        }
        if (i == R.string.MT_Protector) {
            Intent intent = new Intent(c11545.m28824(), (Class<?>) ActivityC8092.class);
            intent.setAction("android.intent.action.VIEW");
            intent.setData(abstractC20745.m46732());
            intent.putExtra("packageName", str);
            c11545.m28824().startActivity(intent);
        }
    }
}
