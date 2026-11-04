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

/* JADX INFO: renamed from: l.ܰۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes4.dex */
public final class DialogInterfaceOnClickListenerC14300 implements DialogInterface.OnClickListener, View.OnClickListener {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static WeakReference f45149;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f45152;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C8614 f45154;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f45155;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public View f45156;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f45157;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C11381 f45158;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f45160;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C18602 f45161;

    /* JADX INFO: renamed from: ۙ᩵۟, reason: not valid java name and contains not printable characters */
    private static final short[] f45148 = {493, -24569, -24545, -24525, -24562, -24563, -24574, -24525, -24548, -24569, -24545, -24512, -24513, -24573, -24546, -24546, -24555, -24512, -24500, -24552, -24572, -24571, -24545, -24500, -24566, -24551, -24574, -24561, -24552, -24571, -24573, -24574, -24500, -24571, -24545, -24500, -24574, -24573, -24552, -24500, -24545, -24551, -24548, -24548, -24573, -24546, -24552, -24567, -24568, -24500, -24566, -24573, -24546, -24500, -24552, -24572, -24571, -24545, -24500, -24563, -24548, -24548, -24500, -24563, -24552, -24500, -24552, -24572, -24567, -24500, -24575, -24573, -24575, -24567, -24574, -24552, -24499, -28, -15651, -13531, 24416, -14610, -14950, -4511, -15037, -15507, -1131, 11145, -264, -10940, -4333, -10940, -3113, -9454, -3341, 8337, 24429};

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f45150 = new AtomicInteger();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static boolean f45151 = true;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AtomicBoolean f45159 = new AtomicBoolean();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f45153 = true;

    /* JADX WARN: Code duplicated, block: B:39:0x0083  */
    /* JADX WARN: Code duplicated, block: B:42:0x008a  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a4  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m34724(String str) {
        short[] sArr = f45148;
        if (C17202.f56030) {
            short s = sArr[0];
            int i = s * s;
            if (C3690.f12684 > 0) {
                int i2 = i + 123298816;
                if (C2354.f7599 < 0) {
                    int i3 = i2 - (s * 22208) >= 0 ? 41068 : 5491;
                    C20327 c20327M46701 = C20327.m46701();
                    short[] sArr2 = f45148;
                    if (C17202.f56030) {
                        if (C20932.f66974 <= 0) {
                            C0773.m3161();
                            RunnableC0334.m2063();
                        } else {
                            String strM46703 = c20327M46701.m46703(C2485.m8350(sArr2, 1, 10, i3), "");
                            if (C11235.f35427 < 0) {
                                short[] sArr3 = f45148;
                                if (C1519.f5300 < 0) {
                                    String strM6966 = C2023.m6966(sArr3, 11, 1, i3);
                                    if (C17202.f56030) {
                                        if (!Arrays.asList(C2878.m9484(strM46703, strM6966)).contains(str)) {
                                            return false;
                                        }
                                        if (C4767.m14717()) {
                                            short[] sArr4 = f45148;
                                            if (!RunnableC0334.m2063()) {
                                                C22673.m51160(C0773.m3166(sArr4, 77, 20, i3));
                                                return true;
                                            }
                                        } else {
                                            short[] sArr5 = f45148;
                                            if (C3734.f12817 < 0) {
                                                C22673.m51160(C17202.m40377(sArr5, 12, 65, i3));
                                                return true;
                                            }
                                        }
                                    }
                                    C0773.m3161();
                                    RunnableC0334.m2063();
                                }
                            }
                        }
                    }
                    if (C23916.f77426 <= 0) {
                        C0950.m3785();
                        if (C3492.f12043 > 0) {
                            C0773.m3161();
                            RunnableC0334.m2063();
                        }
                    } else if (C1146.m4231()) {
                        C0773.m3161();
                        RunnableC0334.m2063();
                    } else {
                        C0950.m3785();
                        if (C3492.f12043 > 0) {
                            C0773.m3161();
                            RunnableC0334.m2063();
                        }
                    }
                } else if (C1146.m4231()) {
                    C0773.m3161();
                    RunnableC0334.m2063();
                } else {
                    C0950.m3785();
                    if (C3492.f12043 > 0) {
                        C0773.m3161();
                        RunnableC0334.m2063();
                    }
                }
            }
        }
        C0773.m3161();
        C2878.m9491();
        return false;
    }

    public DialogInterfaceOnClickListenerC14300(final C8614 c8614, String str) {
        this.f45154 = c8614;
        this.f45155 = C14584.m35193(str, new String[0]);
        final int iIncrementAndGet = f45150.incrementAndGet();
        final C13511 c13511 = new C13511(c8614.m23233(), R.string.MT_Protector);
        C5261.f18540.execute(new Runnable() { // from class: l.ۜۡᩴ
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnClickListenerC14300.m34718(this.f23224, c13511, iIncrementAndGet, c8614);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m34718(DialogInterfaceOnClickListenerC14300 dialogInterfaceOnClickListenerC14300, C13511 c13511, int i, C8614 c8614) {
        C21576.m49062(300L, new RunnableC25028(1, dialogInterfaceOnClickListenerC14300, c13511));
        AbstractC22044 abstractC22044 = dialogInterfaceOnClickListenerC14300.f45155;
        C11381 c11381M55329 = C24808.m55329(abstractC22044);
        dialogInterfaceOnClickListenerC14300.f45158 = c11381M55329;
        String strM43475 = null;
        if (c11381M55329 == null) {
            try {
                C22941 c22941 = new C22941(abstractC22044);
                try {
                    strM43475 = C18685.m43475(c22941);
                    c22941.close();
                } catch (Throwable th) {
                    try {
                        c22941.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused) {
            }
        }
        dialogInterfaceOnClickListenerC14300.f45153 = false;
        C21576.m49068(new RunnableC22506(dialogInterfaceOnClickListenerC14300, c13511, i, strM43475, c8614));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m34716(DialogInterfaceOnClickListenerC14300 dialogInterfaceOnClickListenerC14300, C13511 c13511) {
        if (dialogInterfaceOnClickListenerC14300.f45153) {
            c13511.m33188(new RunnableC13368(3, c13511));
            c13511.m33192();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m34709(C13511 c13511) {
        f45150.incrementAndGet();
        c13511.m33185();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [l.۬ۡᩴ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m34717(final DialogInterfaceOnClickListenerC14300 dialogInterfaceOnClickListenerC14300, C13511 c13511, int i, String str, final C8614 c8614) {
        DialogInterfaceC8327 dialogInterfaceC8327;
        AbstractC22044 abstractC22044 = dialogInterfaceOnClickListenerC14300.f45155;
        c13511.m33185();
        if (i != f45150.get()) {
            return;
        }
        if (dialogInterfaceOnClickListenerC14300.f45158 == null) {
            if (str == null) {
                C1663.m5983(c8614, abstractC22044);
                return;
            }
            String[] strArr = {C21576.m49088(R.string.MT_Protector), C21576.m49088(R.string.MT_Protector)};
            C2361 c2361BuildDialog = c8614.m23233().buildDialog();
            c2361BuildDialog.m8013(strArr, -1, new DialogInterfaceOnClickListenerC15046(dialogInterfaceOnClickListenerC14300, c8614, str, 0));
            c2361BuildDialog.m8021(R.string.MT_Protector);
            c2361BuildDialog.m8016();
            return;
        }
        final Main mainM23233 = c8614.m23233();
        View viewM40395 = mainM23233.m40395(R.layout.MT_Protector);
        dialogInterfaceOnClickListenerC14300.f45156 = viewM40395;
        ImageView imageView = (ImageView) viewM40395.findViewById(R.id.icon);
        imageView.setImageDrawable(dialogInterfaceOnClickListenerC14300.f45158.m28717());
        imageView.setOnClickListener(new ViewOnClickListenerC18191(4, dialogInterfaceOnClickListenerC14300));
        ViewOnClickListenerC15284.m36687((TextView) dialogInterfaceOnClickListenerC14300.f45156.findViewById(R.id.MT_Protector), dialogInterfaceOnClickListenerC14300.f45158.m28715());
        ViewOnClickListenerC15284.m36687((TextView) dialogInterfaceOnClickListenerC14300.f45156.findViewById(R.id.MT_Protector), dialogInterfaceOnClickListenerC14300.f45158.m28718());
        ViewOnClickListenerC15284.m36687((TextView) dialogInterfaceOnClickListenerC14300.f45156.findViewById(R.id.MT_Protector), dialogInterfaceOnClickListenerC14300.f45158.m28716());
        ViewOnClickListenerC15284.m36687((TextView) dialogInterfaceOnClickListenerC14300.f45156.findViewById(R.id.MT_Protector), String.valueOf(dialogInterfaceOnClickListenerC14300.f45158.m28712()));
        ViewOnClickListenerC15284.m36687((TextView) dialogInterfaceOnClickListenerC14300.f45156.findViewById(R.id.MT_Protector), C8311.m22390(dialogInterfaceOnClickListenerC14300.f45158.m28721()));
        ViewOnClickListenerC15284.m36687((TextView) dialogInterfaceOnClickListenerC14300.f45156.findViewById(R.id.MT_Protector), C3200.m10535(dialogInterfaceOnClickListenerC14300.f45158.m28714()));
        ViewOnClickListenerC15284.m36687((TextView) dialogInterfaceOnClickListenerC14300.f45156.findViewById(R.id.MT_Protector), C3200.m10535(dialogInterfaceOnClickListenerC14300.f45158.m28719()));
        TextView textView = (TextView) dialogInterfaceOnClickListenerC14300.f45156.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) dialogInterfaceOnClickListenerC14300.f45156.findViewById(R.id.signature);
        View viewFindViewById = dialogInterfaceOnClickListenerC14300.f45156.findViewById(R.id.MT_Protector);
        ViewOnClickListenerC15284.m36686(textView);
        dialogInterfaceOnClickListenerC14300.m34726();
        C2361 c2361BuildDialog2 = mainM23233.buildDialog();
        c2361BuildDialog2.m8005(dialogInterfaceOnClickListenerC14300.f45156);
        c2361BuildDialog2.m8026(R.string.MT_Protector, null);
        c2361BuildDialog2.m8022(R.string.MT_Protector, dialogInterfaceOnClickListenerC14300);
        if (c8614.m23228("local")) {
            c2361BuildDialog2.m8018(R.string.MT_Protector, dialogInterfaceOnClickListenerC14300);
        }
        WeakReference weakReference = f45149;
        if (weakReference != null && (dialogInterfaceC8327 = (DialogInterfaceC8327) weakReference.get()) != null && dialogInterfaceC8327.m22434()) {
            dialogInterfaceC8327.dismiss();
        }
        dialogInterfaceOnClickListenerC14300.f45152 = c2361BuildDialog2.m8016();
        f45149 = new WeakReference(dialogInterfaceOnClickListenerC14300.f45152);
        final long jM55859 = C25040.m55859(abstractC22044.mo4278());
        Button buttonM22440 = dialogInterfaceOnClickListenerC14300.f45152.m22440();
        dialogInterfaceOnClickListenerC14300.f45152.m22436().setOnClickListener(new ViewOnClickListenerC12809(0, dialogInterfaceOnClickListenerC14300));
        dialogInterfaceOnClickListenerC14300.f45152.m22436().setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ۚۖᩴ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                C25093.m55919(c8614, this.f18787.f45155);
                return true;
            }
        });
        buttonM22440.setOnClickListener(dialogInterfaceOnClickListenerC14300);
        final C3860 c3860 = new C3860(dialogInterfaceOnClickListenerC14300);
        mainM23233.getLifecycle().mo23077(c3860);
        final C7247 c7247M19877 = C7247.m19877(mainM23233);
        final C23998 c23998 = new C23998(dialogInterfaceOnClickListenerC14300);
        c7247M19877.m19880(c23998, new IntentFilter("bin.mt.plus.ACTION_INSTALL_FAILED_DOWNGRADE"));
        dialogInterfaceOnClickListenerC14300.f45152.m22426(new DialogInterface.OnDismissListener() { // from class: l.֫ۖᩴ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C25040.m55861(jM55859);
                mainM23233.getLifecycle().mo23078(c3860);
                c7247M19877.m19879(c23998);
            }
        });
        C8224.f27068.m40350(dialogInterfaceOnClickListenerC14300.f45152, new C11317(0, dialogInterfaceOnClickListenerC14300));
        C5261.f18540.execute(new RunnableC16699(1, dialogInterfaceOnClickListenerC14300, textView));
        C17494.m41003(textView2, viewFindViewById, dialogInterfaceOnClickListenerC14300.f45155, mainM23233, true, new InterfaceC0818() { // from class: l.۬ۡᩴ
            @Override // l.InterfaceC0818
            public final void accept(Object obj) {
                this.f43628.f45161 = (C18602) obj;
            }
        }, new InterfaceC7509() { // from class: l.ۙۖᩴ
            @Override // l.InterfaceC7509
            /* JADX INFO: renamed from: ۫ */
            public final boolean mo924() {
                return DialogInterfaceOnClickListenerC14300.m34737(this.f16337);
            }
        }, dialogInterfaceOnClickListenerC14300.f45159);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m34715(DialogInterfaceOnClickListenerC14300 dialogInterfaceOnClickListenerC14300, C8614 c8614, String str, DialogInterface dialogInterface, int i) {
        AbstractC22044 abstractC22044 = dialogInterfaceOnClickListenerC14300.f45155;
        dialogInterface.dismiss();
        if (i == 0) {
            C1663.m5983(c8614, abstractC22044);
        } else {
            m34708(c8614, abstractC22044, str, (RunnableC22205) null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m34713(DialogInterfaceOnClickListenerC14300 dialogInterfaceOnClickListenerC14300, TextView textView) {
        try {
            String strM52463 = C23316.m52463(dialogInterfaceOnClickListenerC14300.f45155);
            if (dialogInterfaceOnClickListenerC14300.f45152.m22434()) {
                C21576.m49068(new RunnableC10571(0, textView, strM52463));
            }
        } catch (Throwable unused) {
            if (dialogInterfaceOnClickListenerC14300.f45152.m22434()) {
                C21576.m49068(new RunnableC4839(1, textView));
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m34737(DialogInterfaceOnClickListenerC14300 dialogInterfaceOnClickListenerC14300) {
        return !dialogInterfaceOnClickListenerC14300.f45152.m22434();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m34738(DialogInterfaceOnClickListenerC14300 dialogInterfaceOnClickListenerC14300) {
        CharSequence[] charSequenceArr = {C21576.m49088(R.string.MT_Protector), C21576.m49088(R.string.MT_Protector), C21576.m49088(R.string.MT_Protector)};
        C2361 c2361BuildDialog = dialogInterfaceOnClickListenerC14300.f45154.m23233().buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8013(charSequenceArr, -1, new DialogInterfaceOnClickListenerC13348(1, dialogInterfaceOnClickListenerC14300));
        c2361BuildDialog.m8016();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34711(DialogInterfaceOnClickListenerC14300 dialogInterfaceOnClickListenerC14300, DialogInterface dialogInterface, int i) {
        C8614 c8614 = dialogInterfaceOnClickListenerC14300.f45154;
        dialogInterface.dismiss();
        if (i == 0) {
            new C24744(dialogInterfaceOnClickListenerC14300, c8614.m23170(dialogInterfaceOnClickListenerC14300.f45158.m28715() + "_icon.zip", false)).m8197();
            return;
        }
        if (i == 1 || i == 2) {
            new C16538(dialogInterfaceOnClickListenerC14300, c8614.m23170(dialogInterfaceOnClickListenerC14300.f45158.m28715() + "_icon" + new String[]{".png", ".webp"}[i - 1], false), i).m8197();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m34706(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int iM19160 = C6907.m19160(200.0f);
        if (intrinsicWidth < iM19160) {
            intrinsicHeight = (int) (intrinsicHeight * (iM19160 / intrinsicWidth));
            intrinsicWidth = iM19160;
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
    public static void m34721(C22941 c22941, C25179 c25179, C21246 c21246, int i, boolean z, C23001 c23001) {
        C8002 entry;
        for (InterfaceC8697 interfaceC8697 : c21246.m48422(i)) {
            if (z) {
                InterfaceC10869 interfaceC10869Mo18153 = interfaceC8697.mo18153();
                InterfaceC15344 type = interfaceC8697.getType();
                InterfaceC2731 interfaceC2731Mo18158 = interfaceC8697.mo18158();
                C25239 c25239M51891 = c23001.m51891(interfaceC10869Mo18153.mo27607(), interfaceC10869Mo18153.getPackageName());
                c25239M51891.m56370(interfaceC10869Mo18153.mo27606());
                C23747 c23747M56375 = c25239M51891.m56375(type.mo35833(), type.getTypeName());
                C20017 c20017M53013 = c23747M56375.m53013(interfaceC2731Mo18158.mo9073());
                c23747M56375.m53016(interfaceC8697.mo23383(), interfaceC8697.mo18156(), false);
                c20017M53013.m46050(interfaceC8697.mo23383()).m32853(interfaceC8697);
            }
            if (!interfaceC8697.mo18155()) {
                InterfaceC5650 value = interfaceC8697.getValue();
                if (value.mo16636() && (entry = c22941.getEntry(value.mo11710().getValue())) != null) {
                    c25179.m56126(entry, c22941);
                    try {
                        XmlResourceParserC9734 xmlResourceParserC9734M35991 = C14955.m35982(c22941.m51731(entry, (C3374) null)).m35991();
                        while (true) {
                            int next = xmlResourceParserC9734M35991.next();
                            if (next != 1) {
                                if (next == 2) {
                                    int attributeCount = xmlResourceParserC9734M35991.getAttributeCount();
                                    for (int i2 = 0; i2 < attributeCount; i2++) {
                                        if (xmlResourceParserC9734M35991.m25344(i2) == 1) {
                                            m34721(c22941, c25179, c21246, xmlResourceParserC9734M35991.m25350(i2), true, c23001);
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
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void m34726() {
        int i;
        PackageInfo packageInfo;
        long j;
        int i2;
        int i3;
        String str;
        String str2;
        String str3;
        String strMo4294;
        long j2;
        float f;
        boolean z = this.f45160;
        if (z) {
            this.f45160 = false;
        }
        PackageManager packageManagerM49081 = C21576.m49081();
        String strMo4295 = null;
        try {
            Iterator<PackageInfo> it = packageManagerM49081.getInstalledPackages(0).iterator();
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
            } while (!packageInfo.packageName.equals(this.f45158.m28718()));
        } catch (Throwable unused2) {
            i = 0;
        }
        if (packageInfo == null && i <= 1) {
            try {
                packageInfo = packageManagerM49081.getPackageInfo(this.f45158.m28718(), 0);
            } catch (Throwable unused3) {
            }
        }
        if (packageInfo != null) {
            String str4 = packageInfo.versionName;
            i2 = packageInfo.versionCode;
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            String str5 = applicationInfo.sourceDir;
            str2 = applicationInfo.dataDir;
            AbstractC22044 abstractC22044 = C6382.f21566;
            AbstractC22044 abstractC22044M49876 = abstractC22044.m49876("Android/data/" + packageInfo.packageName);
            if (abstractC22044M49876.mo4281()) {
                strMo4294 = abstractC22044M49876.mo4294();
            } else {
                strMo4294 = (Build.VERSION.SDK_INT < 34 || C4013.m12986().mo29537() || (packageInfo.applicationInfo.flags & 129) != 0) ? null : abstractC22044M49876.mo4294();
            }
            AbstractC22044 abstractC22044M49877 = abstractC22044.m49876("Android/obb/" + packageInfo.packageName);
            strMo4295 = abstractC22044M49877.mo4281() ? abstractC22044M49877.mo4294() : null;
            i3 = packageInfo.applicationInfo.uid;
            j = packageInfo.firstInstallTime;
            j2 = packageInfo.lastUpdateTime;
            str3 = str4;
            str = strMo4295;
            strMo4295 = str5;
        } else {
            j = 0;
            i2 = 0;
            i3 = 0;
            str = null;
            str2 = null;
            str3 = null;
            strMo4294 = null;
            j2 = 0;
        }
        if (strMo4295 != null && this.f45156.findViewById(R.id.MT_Protector).getVisibility() == 0 && ((TextView) this.f45156.findViewById(R.id.apkPath)).getText().toString().equals(strMo4295)) {
            return;
        }
        if (strMo4295 != null) {
            this.f45156.findViewById(R.id.MT_Protector).setVisibility(0);
            this.f45156.findViewById(R.id.MT_Protector).setVisibility(0);
            this.f45156.findViewById(R.id.MT_Protector).setVisibility(0);
            if (str2 != null) {
                this.f45156.findViewById(R.id.MT_Protector).setVisibility(0);
                TextView textView = (TextView) this.f45156.findViewById(R.id.dataDirectory);
                SpannableString spannableString = new SpannableString(str2);
                spannableString.setSpan(new AbsoluteSizeSpan(C6907.m19161(13.0f)), 0, spannableString.length(), 17);
                textView.setText(spannableString);
                ViewOnClickListenerC15284.m36688(textView);
                textView.setOnClickListener(this);
                f = 13.0f;
            } else {
                f = 13.0f;
                this.f45156.findViewById(R.id.MT_Protector).setVisibility(8);
            }
            if (strMo4294 != null) {
                this.f45156.findViewById(R.id.MT_Protector).setVisibility(0);
                ((TextView) this.f45156.findViewById(R.id.textView6)).setText(C21576.m49088(R.string.MT_Protector).concat(" 1"));
                ((TextView) this.f45156.findViewById(R.id.textView10)).setText(C21576.m49088(R.string.MT_Protector).concat(" 2"));
                TextView textView2 = (TextView) this.f45156.findViewById(R.id.dataDirectory2);
                SpannableString spannableString2 = new SpannableString(strMo4294);
                spannableString2.setSpan(new AbsoluteSizeSpan(C6907.m19161(f)), 0, spannableString2.length(), 17);
                textView2.setText(spannableString2);
                ViewOnClickListenerC15284.m36688(textView2);
                textView2.setOnClickListener(this);
            } else {
                this.f45156.findViewById(R.id.MT_Protector).setVisibility(8);
            }
            if (str != null) {
                this.f45156.findViewById(R.id.MT_Protector).setVisibility(0);
                TextView textView3 = (TextView) this.f45156.findViewById(R.id.obbDirectory);
                SpannableString spannableString3 = new SpannableString(str);
                spannableString3.setSpan(new AbsoluteSizeSpan(C6907.m19161(f)), 0, spannableString3.length(), 17);
                textView3.setText(spannableString3);
                ViewOnClickListenerC15284.m36688(textView3);
                textView3.setOnClickListener(this);
            } else {
                this.f45156.findViewById(R.id.MT_Protector).setVisibility(8);
            }
            ViewOnClickListenerC15284.m36687((TextView) this.f45156.findViewById(R.id.installedVersion), str3 + " (" + i2 + MotionUtils.EASING_TYPE_FORMAT_END);
            TextView textView4 = (TextView) this.f45156.findViewById(R.id.apkPath);
            SpannableString spannableString4 = new SpannableString(strMo4295);
            spannableString4.setSpan(new AbsoluteSizeSpan(C6907.m19161(f)), 0, spannableString4.length(), 17);
            textView4.setText(spannableString4);
            ViewOnClickListenerC15284.m36688(textView4);
            textView4.setOnClickListener(this);
            ViewOnClickListenerC15284.m36687((TextView) this.f45156.findViewById(R.id.uid), String.valueOf(i3));
            ViewOnClickListenerC15284.m36687((TextView) this.f45156.findViewById(R.id.firstInstall), C22482.m50718(j));
            ViewOnClickListenerC15284.m36687((TextView) this.f45156.findViewById(R.id.lastUpdate), C22482.m50718(j2));
            this.f45157 = ((long) i2) > this.f45158.m28712();
            return;
        }
        this.f45156.findViewById(R.id.MT_Protector).setVisibility(8);
        this.f45156.findViewById(R.id.MT_Protector).setVisibility(8);
        this.f45156.findViewById(R.id.MT_Protector).setVisibility(8);
        this.f45156.findViewById(R.id.MT_Protector).setVisibility(8);
        this.f45156.findViewById(R.id.MT_Protector).setVisibility(8);
        this.f45156.findViewById(R.id.MT_Protector).setVisibility(8);
        this.f45156.findViewById(R.id.MT_Protector).setVisibility(8);
        this.f45156.findViewById(R.id.MT_Protector).setVisibility(8);
        this.f45157 = false;
        if (z) {
            m34722(false);
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C1663.m5983(this.f45154, this.f45155);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34712(DialogInterfaceOnClickListenerC14300 dialogInterfaceOnClickListenerC14300, View view) {
        if (!ApplicationC17729.f58262.getBoolean("apk_installation_verify", true)) {
            dialogInterfaceOnClickListenerC14300.m34722(true);
            return;
        }
        C18602 c18602 = dialogInterfaceOnClickListenerC14300.f45161;
        if (c18602 != null && c18602.m43228() && !dialogInterfaceOnClickListenerC14300.f45161.m43222()) {
            C2361 c2361BuildDialog = dialogInterfaceOnClickListenerC14300.f45154.m23233().buildDialog();
            c2361BuildDialog.m8021(R.string.MT_Protector);
            c2361BuildDialog.m8000(R.string.MT_Protector);
            c2361BuildDialog.m8026(R.string.MT_Protector, null);
            c2361BuildDialog.m8018(R.string.MT_Protector, new DialogInterfaceOnClickListenerC5891(3, dialogInterfaceOnClickListenerC14300));
            C5416.m16141(c2361BuildDialog.m8016());
            return;
        }
        view.setEnabled(false);
        new C20268(dialogInterfaceOnClickListenerC14300, view).m8197();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m34722(boolean z) {
        int i = 0;
        if (z && !ApplicationC17729.f58262.getBoolean("apk_installation_confirm", false)) {
            z = false;
        }
        if (z) {
            boolean z2 = (!C8224.m22128() || C20327.m46701().m46704("disable_install_by_shizuku") || C8224.m22131() == 0) ? false : true;
            boolean zM22129 = C8224.m22129();
            if (!z2 && !zM22129) {
                z = false;
            }
        }
        AbstractC22044 abstractC22044 = this.f45155;
        C8614 c8614 = this.f45154;
        if (z) {
            C2361 c2361BuildDialog = c8614.m23233().buildDialog();
            c2361BuildDialog.m8021(R.string.MT_Protector);
            c2361BuildDialog.m8008(C21576.m49059(R.string.MT_Protector, abstractC22044.getName()));
            c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC21760(i, this));
            c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c2361BuildDialog.m8016();
            return;
        }
        C8224.m22123(c8614.m23233(), abstractC22044, this.f45158.m28718());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C25291 c25291M40238;
        C25291 c25291M40239;
        int id = view.getId();
        C8614 c8614 = this.f45154;
        if (id == R.id.dataDirectory) {
            this.f45152.dismiss();
            if (!C7756.m21096() && (c25291M40239 = C17085.m40238(this.f45158.m28718())) != null) {
                c8614.m23226(c25291M40239.m56469() + "/data", true);
                return;
            }
            c8614.m23226(((TextView) view).getText().toString(), true);
            return;
        }
        if (view.getId() == R.id.dataDirectory2) {
            this.f45152.dismiss();
            if (!C7756.m21096() && (c25291M40238 = C17085.m40238(this.f45158.m28718())) != null) {
                c8614.m23226(c25291M40238.m56469() + "/android_data", true);
                return;
            }
            c8614.m23226(((TextView) view).getText().toString(), true);
            return;
        }
        if (view.getId() == R.id.obbDirectory) {
            this.f45152.dismiss();
            c8614.m23226(((TextView) view).getText().toString(), true);
        } else {
            if (view.getId() == R.id.apkPath) {
                this.f45152.dismiss();
                File file = new File(((TextView) view).getText().toString());
                c8614.m23230(file.getName());
                c8614.m23226(file.getParent(), true);
                return;
            }
            String strM28718 = this.f45158.m28718();
            DialogInterfaceC8327 dialogInterfaceC8327 = this.f45152;
            C17359.requireNonNull(dialogInterfaceC8327);
            m34708(c8614, this.f45155, strM28718, new RunnableC22205(1, dialogInterfaceC8327));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34708(final C8614 c8614, final AbstractC22044 abstractC22044, final String str, final RunnableC22205 runnableC22205) {
        boolean z = C21576.m49055().getBoolean(R.bool.MT_Protector);
        ViewOnClickListenerC23411 viewOnClickListenerC23411 = new ViewOnClickListenerC23411(c8614.m23233(), null);
        if (z) {
            viewOnClickListenerC23411.m52603(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC23411.m52603(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC23411.m52603(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC23411.m52603(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC23411.m52603(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC23411.m52603(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC23411.m52603(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC23411.m52603(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC23411.m52603(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC23411.m52603(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC23411.m52603(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC23411.m52603(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC23411.m52603(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC23411.m52603(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC23411.m52603(R.string.MT_Protector, R.string.MT_Protector);
        } else {
            viewOnClickListenerC23411.m52603(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC23411.m52603(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC23411.m52603(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC23411.m52603(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC23411.m52603(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC23411.m52603(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC23411.m52603(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC23411.m52603(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC23411.m52603(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC23411.m52603(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC23411.m52603(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC23411.m52603(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC23411.m52603(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC23411.m52603(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC23411.m52603(R.string.MT_Protector, R.string.MT_Protector);
        }
        viewOnClickListenerC23411.m52605(new InterfaceC15951() { // from class: l.ᩴۖᩴ
            @Override // l.InterfaceC15951
            /* JADX INFO: renamed from: ۙ */
            public final void mo38065(int i) {
                DialogInterfaceOnClickListenerC14300.m34707(str, runnableC22205, c8614, abstractC22044, i);
            }
        });
        if (z) {
            viewOnClickListenerC23411.m52608();
        } else {
            viewOnClickListenerC23411.m52607();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m34707(String str, Runnable runnable, C8614 c8614, AbstractC22044 abstractC22044, int i) {
        if (i == R.string.MT_Protector && m34724(str)) {
            return;
        }
        if (runnable != null) {
            runnable.run();
        }
        if (i == R.string.MT_Protector) {
            C3259.m10633(c8614, new String[]{abstractC22044.mo4294()}, str, true, false);
            return;
        }
        if (i == R.string.MT_Protector) {
            C3259.m10635(abstractC22044, c8614, str);
            return;
        }
        if (i == R.string.MT_Protector) {
            C3259.m10643(abstractC22044, c8614, str);
            return;
        }
        if (i == R.string.MT_Protector) {
            C3259.m10645(abstractC22044, c8614, str);
            return;
        }
        if (i == R.string.MT_Protector) {
            C3259.m10634(abstractC22044, c8614, str);
            return;
        }
        if (i == R.string.MT_Protector) {
            C3259.m10638(abstractC22044, c8614, str);
            return;
        }
        if (i == R.string.MT_Protector) {
            C3259.m10641(abstractC22044, c8614, str);
            return;
        }
        if (i == R.string.MT_Protector) {
            C3259.m10639(abstractC22044, c8614, str);
            return;
        }
        if (i == R.string.MT_Protector) {
            if (!C18978.m44079()) {
                C22673.m51152(R.string.MT_Protector);
                return;
            } else {
                C3259.m10642(abstractC22044, c8614, str);
                return;
            }
        }
        if (i == R.string.MT_Protector) {
            C3259.m10644(abstractC22044, c8614, str);
            return;
        }
        if (i == R.string.MT_Protector) {
            C3259.m10631(abstractC22044, c8614, str);
            return;
        }
        if (i == R.string.MT_Protector) {
            C3259.m10637(abstractC22044, c8614, str);
            return;
        }
        if (i == R.string.MT_Protector) {
            C3259.m10636(abstractC22044, c8614, str);
            return;
        }
        if (i == R.string.MT_Protector) {
            C3259.m10640(abstractC22044, c8614, str);
            return;
        }
        if (i == R.string.MT_Protector) {
            Intent intent = new Intent(c8614.m23233(), (Class<?>) ActivityC23375.class);
            intent.setAction("android.intent.action.VIEW");
            intent.setData(abstractC22044.m49836());
            intent.putExtra("packageName", str);
            c8614.m23233().startActivity(intent);
        }
    }
}
