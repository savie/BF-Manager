package l;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳ۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes4.dex */
public final class C17901 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C10157 f56679 = new C10157(25);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public InterfaceC15080 f56680;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ArrayList f56681 = new ArrayList();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f56682;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 f56683;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC19356 f56684;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f56685;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C23313 f56686;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final View f56687;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C23630 f56688;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41532(C11545 c11545, InterfaceC2557 interfaceC2557, boolean z) {
        AbstractC20745 abstractC20745Mo13040 = c11545.m28817().mo13040(interfaceC2557);
        String strMo7967 = interfaceC2557.mo7967();
        C17901 c17901 = new C17901(c11545.m28824(), C23630.m52095(c11545.m28824(), abstractC20745Mo13040, strMo7967));
        c17901.f56680 = new C3167(c11545, interfaceC2557);
        if (z) {
            c17901.f56685 = "built-in";
            c17901.f56682 = !strMo7967.equals("*/*");
        }
        new C22135(c17901, null).m10243();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41533(C11545 c11545, AbstractC20745 abstractC20745) {
        Main mainM28824 = c11545.m28824();
        C17901 c17901 = new C17901(mainM28824, C23630.m52095(mainM28824, C11904.f39938.m46690("a.apk"), "application/vnd.android.package-archive"));
        c17901.f56685 = "default";
        c17901.f56682 = true;
        View view = c17901.f56687;
        view.findViewById(R.id.MT_Protector).setVisibility(4);
        view.findViewById(R.id.searchView).setVisibility(4);
        DialogInterfaceC19356 dialogInterfaceC19356 = c17901.f56684;
        dialogInterfaceC19356.m44365(-2, null, null);
        dialogInterfaceC19356.m44365(-3, null, null);
        c17901.f56680 = new C4495(abstractC20745, mainM28824);
        new C22135(c17901, null).m10243();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41535(AbstractActivityC12483 abstractActivityC12483, C21696 c21696) {
        C17901 c17901 = new C17901(abstractActivityC12483, C23630.m52095(abstractActivityC12483, C11904.f39938.m46690("a.apk"), "application/vnd.android.package-archive"));
        c17901.f56685 = "default";
        c17901.f56682 = true;
        View view = c17901.f56687;
        view.findViewById(R.id.MT_Protector).setVisibility(4);
        view.findViewById(R.id.searchView).setVisibility(4);
        DialogInterfaceC19356 dialogInterfaceC19356 = c17901.f56684;
        dialogInterfaceC19356.m44365(-2, null, null);
        dialogInterfaceC19356.m44365(-3, abstractActivityC12483.getString(R.string.MT_Protector), null);
        ((TextView) view.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        TextView textView = (TextView) view.findViewById(R.id.MT_Protector);
        textView.setText(R.string.MT_Protector);
        textView.setVisibility(0);
        c17901.f56680 = new C13669(c21696);
        new C22135(c17901, new RunnableC14458(c17901, c21696, 0)).m10243();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m41539(C17901 c17901, C21696 c21696) {
        Button buttonM44361 = c17901.f56684.m44361();
        if (ApplicationC0716.f2992.contains("dsai")) {
            buttonM44361.setOnClickListener(new ViewOnClickListenerC16870(1, c21696, c17901));
        } else {
            buttonM44361.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m41545(C17901 c17901, C21696 c21696) {
        ApplicationC0716.f2992.edit().remove("dsai").apply();
        c21696.mo8453();
        c17901.f56684.dismiss();
    }

    public C17901(AbstractActivityC12483 abstractActivityC12483, C23630 c23630) {
        this.f56683 = abstractActivityC12483;
        this.f56688 = c23630;
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        this.f56687 = viewM30995;
        C12963 c12963 = new C12963(this);
        C23313 c23313 = (C23313) viewM30995.findViewById(R.id.MT_Protector);
        this.f56686 = c23313;
        c23313.setLayoutManager(new C16062((Context) abstractActivityC12483, 3));
        c23313.setAdapter(c12963);
        View viewInflate = LayoutInflater.from(abstractActivityC12483).inflate(R.layout.MT_Protector, (ViewGroup) c23313, false);
        viewInflate.measure(0, 0);
        c23313.m51393((C6695.f22573.size() / 3) * viewInflate.getMeasuredHeight());
        C16754.m39316(c23313);
        View viewFindViewById = viewM30995.findViewById(R.id.MT_Protector);
        ((C1439) viewM30995.findViewById(R.id.searchView)).m5029(new C11552(c12963, viewFindViewById, viewM30995.findViewById(R.id.MT_Protector)));
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC17445(1, abstractActivityC12483));
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(abstractActivityC12483);
        c8067.m21258(viewM30995);
        c8067.m21251(R.string.MT_Protector, null);
        c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f56684 = c8067.m21252();
        String strM52097 = c23630.m52097();
        if (strM52097.equals("*/*")) {
            this.f56685 = "built-in";
            return;
        }
        if (strM52097.startsWith("text/")) {
            this.f56685 = "text/*";
            return;
        }
        if (strM52097.startsWith("image/")) {
            this.f56685 = "image/*";
            return;
        }
        if (strM52097.startsWith("video/")) {
            this.f56685 = "video/*";
        } else if (strM52097.startsWith("audio/")) {
            this.f56685 = "audio/*";
        } else {
            this.f56685 = "default";
            this.f56682 = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41534(C12418 c12418, int i, int i2, String str) {
        MenuItem menuItemAdd = c12418.add(i, i2, 0, i2);
        if (C13638.equals(this.f56685, str)) {
            menuItemAdd.setCheckable(true).setChecked(true);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41538(C17901 c17901, View view) {
        C16195 c16195 = new C16195(c17901.f56683, view, 0);
        C12418 c12418M38298 = c16195.m38298();
        C20491.m46296(c12418M38298);
        c17901.m41534(c12418M38298, R.id.MT_Protector, R.string.MT_Protector, "built-in");
        if (c17901.f56682) {
            c17901.m41534(c12418M38298, R.id.MT_Protector, R.string.MT_Protector, "default");
        }
        c17901.m41534(c12418M38298, R.id.MT_Protector, R.string.MT_Protector, "text/*");
        c17901.m41534(c12418M38298, R.id.MT_Protector, R.string.MT_Protector, "image/*");
        c17901.m41534(c12418M38298, R.id.MT_Protector, R.string.MT_Protector, "video/*");
        c17901.m41534(c12418M38298, R.id.MT_Protector, R.string.MT_Protector, "audio/*");
        c17901.m41534(c12418M38298, R.id.MT_Protector, R.string.MT_Protector, "*/*");
        c16195.m38296(new C6156(2, c17901));
        c16195.m38297();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41537(C17901 c17901, MenuItem menuItem) {
        String str;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            str = "built-in";
        } else if (itemId == R.string.MT_Protector) {
            str = "default";
        } else if (itemId == R.string.MT_Protector) {
            str = "text/*";
        } else if (itemId == R.string.MT_Protector) {
            str = "image/*";
        } else if (itemId == R.string.MT_Protector) {
            str = "video/*";
        } else {
            str = itemId == R.string.MT_Protector ? "audio/*" : "*/*";
        }
        if (C13638.equals(c17901.f56685, str)) {
            return;
        }
        c17901.f56685 = str;
        new C0967(c17901).m10243();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static void m41543(C17901 c17901) {
        ArrayList arrayList = c17901.f56681;
        arrayList.clear();
        if ("built-in".equals(c17901.f56685)) {
            for (int i : DialogInterfaceOnDismissListenerC5468.m15137()) {
                C6695 c6695M18078 = C6695.m18078(i);
                C22841 c22841 = new C22841();
                c22841.f74304 = c6695M18078;
                c22841.f74303 = c6695M18078.m18079().f2940.m35074();
                c22841.f74300 = c6695M18078.m18081();
                arrayList.add(c22841);
            }
            return;
        }
        List<C12341> listM52098 = c17901.f56688.m52098(c17901.f56685);
        PackageManager packageManager = c17901.f56683.getPackageManager();
        for (C12341 c12341 : listM52098) {
            C22841 c22842 = new C22841();
            c22842.f74302 = packageManager;
            c22842.f74301 = c12341;
            c22842.f74300 = c12341.m30652(packageManager);
            c22842.f74305 = new RunnableC6612(c22842);
            arrayList.add(c22842);
        }
        int size = arrayList.size();
        boolean[] zArr = new boolean[size];
        for (int i2 = 0; i2 < size - 1; i2++) {
            if (!zArr[i2]) {
                C22841 c22843 = (C22841) arrayList.get(i2);
                String strM30651 = c22843.f74301.m30651();
                boolean z = false;
                for (int i3 = i2 + 1; i3 < size; i3++) {
                    C22841 c22844 = (C22841) arrayList.get(i3);
                    String str = c22844.f74300;
                    C12341 c12342 = c22844.f74301;
                    if (str.equals(c22843.f74300) && !strM30651.equals(c12342.m30651())) {
                        c22844.f74300 += "\n(" + c12342.m30651() + ')';
                        z = true;
                        zArr[i3] = true;
                    }
                }
                if (z) {
                    c22843.f74300 += "\n(" + c22843.f74301.m30651() + ')';
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41540(C17901 c17901, boolean z) {
        AbstractActivityC12483 abstractActivityC12483 = c17901.f56683;
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(abstractActivityC12483);
        c8067.m21274(R.string.MT_Protector);
        c8067.m21253(R.string.MT_Protector);
        c8067.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC3746(2, c17901));
        c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        if (z) {
            c8067.m21271(R.string.MT_Protector, new DialogInterfaceOnClickListenerC1756());
        }
        c8067.m21269();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41536(C17901 c17901) {
        AbstractActivityC12483 abstractActivityC12483 = c17901.f56683;
        try {
            AbstractC20745 abstractC20745M46690 = C11904.f39941.m46690("filetransfer.apk");
            abstractC20745M46690.m46694(abstractActivityC12483.getAssets().open("filetransfer.apk"));
            Uri uriM46712 = abstractC20745M46690.m46712();
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriM46712, "application/vnd.android.package-archive");
            intent.addFlags(268435456);
            C21273.m47737(intent, uriM46712);
            abstractActivityC12483.startActivity(intent);
        } catch (IOException e) {
            abstractActivityC12483.m31002(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
