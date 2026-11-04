package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.tabs.TabLayout;
import java.io.IOException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes.dex */
public final class C25093 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f81137;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f81138;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public InterfaceC15395 f81139;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC8327 f81140;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C14019 f81142;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f81143;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f81145;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C1972 f81146;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f81147;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C20312 f81148;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final View f81150;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f81151;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final TabLayout f81152;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f81153;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f81141 = new ArrayList();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f81144 = "";

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public String f81149 = "";

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f81136 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m55918(C8614 c8614, InterfaceC2386 interfaceC2386, boolean z) {
        AbstractC22044 abstractC22044Mo10176 = c8614.m23213().mo10176(interfaceC2386);
        Main mainM23233 = c8614.m23233();
        C25093 c25093 = new C25093(mainM23233, C20312.m46653(mainM23233, abstractC22044Mo10176, interfaceC2386.mo8114()));
        c25093.f81149 = interfaceC2386.mo8098();
        c25093.f81137 = true;
        c25093.f81139 = new C18820(c8614, interfaceC2386);
        if (z) {
            c25093.f81143 = "built-in";
            c25093.f81147 = !c25093.f81148.m46655().equals("*/*");
        }
        c25093.m55915();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C25093 m55914(AbstractActivityC17204 abstractActivityC17204) {
        AbstractC22044 abstractC22044M49876 = C6382.f21568.m49876("a.apk");
        C25093 c25093 = new C25093(abstractActivityC17204, C20312.m46653(abstractActivityC17204, abstractC22044M49876, "application/vnd.android.package-archive"));
        c25093.f81143 = "default";
        c25093.f81145 = true;
        c25093.f81149 = abstractC22044M49876.m49864();
        View view = c25093.f81150;
        view.findViewById(R.id.help).setVisibility(4);
        view.findViewById(R.id.searchView).setVisibility(4);
        return c25093;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m55919(C8614 c8614, AbstractC22044 abstractC22044) {
        Main mainM23233 = c8614.m23233();
        C25093 c25093M55914 = m55914(mainM23233);
        c25093M55914.f81137 = true;
        c25093M55914.f81139 = new C0921(abstractC22044, mainM23233);
        c25093M55914.m55915();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m55920(AbstractActivityC17204 abstractActivityC17204, C2119 c2119) {
        C25093 c25093M55914 = m55914(abstractActivityC17204);
        DialogInterfaceC8327 dialogInterfaceC8327 = c25093M55914.f81140;
        dialogInterfaceC8327.m22424(-3, abstractActivityC17204.getString(R.string.MT_Protector), null);
        View view = c25093M55914.f81150;
        ((TextView) view.findViewById(R.id.title)).setText(R.string.MT_Protector);
        TextView textView = (TextView) view.findViewById(R.id.installer_description);
        textView.setText(R.string.MT_Protector);
        textView.setVisibility(0);
        c25093M55914.f81139 = new C9123(c2119);
        c25093M55914.m55915();
        Button buttonM22440 = dialogInterfaceC8327.m22440();
        if (ApplicationC17729.f58258.contains("dsai")) {
            buttonM22440.setOnClickListener(new ViewOnClickListenerC12107(0, c2119, c25093M55914));
        } else {
            buttonM22440.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m55917(C2119 c2119, C25093 c25093) {
        ApplicationC17729.f58258.edit().remove("dsai").apply();
        c2119.mo7306();
        c25093.f81140.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v9, types: [l.ܰۘᩴ, l.᩷᩻ۙ] */
    public C25093(final AbstractActivityC17204 abstractActivityC17204, C20312 c20312) {
        this.f81138 = abstractActivityC17204;
        this.f81148 = c20312;
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        this.f81150 = viewM40395;
        C14019 c14019 = (C14019) viewM40395.findViewById(R.id.MT_Protector);
        this.f81142 = c14019;
        this.f81152 = (TabLayout) viewM40395.findViewById(R.id.tabLayout);
        View viewInflate = LayoutInflater.from(abstractActivityC17204).inflate(R.layout.MT_Protector, (ViewGroup) c14019, false);
        ((TextView) viewInflate.findViewById(R.id.textView1)).setText(R.string.MT_Protector);
        viewInflate.measure(0, 0);
        C11651 c11651 = (C11651) c14019.getLayoutParams();
        c11651.f37747 = ((C1512.f5258.size() + 2) / 3) * viewInflate.getMeasuredHeight();
        c14019.setLayoutParams(c11651);
        View viewFindViewById = viewM40395.findViewById(R.id.help);
        View viewFindViewById2 = viewM40395.findViewById(R.id.title);
        final C7308 c7308 = (C7308) viewM40395.findViewById(R.id.searchView);
        c7308.m20007(new C2412(this, viewFindViewById, viewFindViewById2));
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC18191(3, this));
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(abstractActivityC17204);
        c2361.m8005(viewM40395);
        c2361.m8026(R.string.MT_Protector, null);
        c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361.m8012(true);
        DialogInterfaceC8327 dialogInterfaceC8327M7999 = c2361.m7999();
        this.f81140 = dialogInterfaceC8327M7999;
        dialogInterfaceC8327M7999.m22426(new DialogInterface.OnDismissListener() { // from class: l.᩺ۘᩴ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C25093.m55938(this.f77765);
            }
        });
        dialogInterfaceC8327M7999.m22427(new DialogInterface.OnKeyListener() { // from class: l.ۘۘᩴ
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                return C25093.m55927(this.f13311, c7308, i2, keyEvent);
            }
        });
        final ?? r2 = new InterfaceC5252() { // from class: l.ܰۘᩴ
            @Override // l.InterfaceC5252
            /* JADX INFO: renamed from: ۙ */
            public final void mo2183(InterfaceC11217 interfaceC11217, EnumC9330 enumC9330) {
                C25093.m55924(this.f45245, enumC9330);
            }
        };
        abstractActivityC17204.getLifecycle().mo23077(r2);
        dialogInterfaceC8327M7999.getLifecycle().mo23077(new InterfaceC5252() { // from class: l.᩶ۘᩴ
            @Override // l.InterfaceC5252
            /* JADX INFO: renamed from: ۙ */
            public final void mo2183(InterfaceC11217 interfaceC11217, EnumC9330 enumC9330) {
                C25093.m55925(this.f67295, abstractActivityC17204, r2, enumC9330);
            }
        });
        String strM46655 = c20312.m46655();
        if (strM46655.equals("*/*")) {
            this.f81143 = "built-in";
            return;
        }
        if (strM46655.startsWith("text/")) {
            this.f81143 = "text/*";
            return;
        }
        if (strM46655.startsWith("image/")) {
            this.f81143 = "image/*";
            return;
        }
        if (strM46655.startsWith("video/")) {
            this.f81143 = "video/*";
        } else if (strM46655.startsWith("audio/")) {
            this.f81143 = "audio/*";
        } else {
            this.f81143 = "default";
            this.f81147 = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m55927(C25093 c25093, C7308 c7308, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
            if (c7308.m20011()) {
                c7308.m20006((String) null);
                c7308.m20012();
                return true;
            }
            c25093.f81140.cancel();
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m55924(C25093 c25093, EnumC9330 enumC9330) {
        if (enumC9330 == EnumC9330.ON_DESTROY) {
            c25093.f81140.dismiss();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m55925(C25093 c25093, AbstractActivityC17204 abstractActivityC17204, C14344 c14344, EnumC9330 enumC9330) {
        if (enumC9330 == EnumC9330.ON_DESTROY) {
            if (!c25093.f81151) {
                c25093.f81151 = true;
                C19871.m45732(c25093);
            }
            abstractActivityC17204.getLifecycle().mo23078(c14344);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m55941(C25093 c25093) {
        C2361 c2361BuildDialog = c25093.f81138.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8000(R.string.MT_Protector);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8016().m22440().setOnClickListener(new ViewOnClickListenerC7633(0, c25093));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m55940(C25093 c25093) {
        AbstractActivityC17204 abstractActivityC17204 = c25093.f81138;
        abstractActivityC17204.startActivity(new Intent(abstractActivityC17204, (Class<?>) ActivityC15090.class));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m55915() {
        ArrayList arrayList;
        if (this.f81145) {
            m55916(R.string.MT_Protector, this.f81143);
        } else {
            m55916(R.string.MT_Protector, "built-in");
            if (this.f81147) {
                m55916(R.string.MT_Protector, "default");
            }
            m55916(R.string.MT_Protector, "text/*");
            m55916(R.string.MT_Protector, "image/*");
            m55916(R.string.MT_Protector, "video/*");
            m55916(R.string.MT_Protector, "audio/*");
            m55916(R.string.MT_Protector, "*/*");
        }
        C8378 c8378 = new C8378(this);
        C14019 c14019 = this.f81142;
        c14019.m36514(c8378);
        int i = 0;
        int i2 = 0;
        while (true) {
            arrayList = this.f81141;
            if (i >= arrayList.size()) {
                break;
            }
            if (((C1972) arrayList.get(i)).f6614.equals(this.f81143)) {
                i2 = i;
            }
            i++;
        }
        c14019.m36522(Math.max(1, arrayList.size() - 1));
        c14019.m36512(i2, false);
        TabLayout tabLayout = this.f81152;
        tabLayout.setupWithViewPager(c14019);
        tabLayout.clearOnTabSelectedListeners();
        tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C6887(this, c14019));
        tabLayout.setVisibility(this.f81145 ? 8 : 0);
        c14019.m34140(!this.f81145);
        c14019.m36513(new C13598(this));
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f81140;
        dialogInterfaceC8327.m22432();
        Button buttonM22433 = dialogInterfaceC8327.m22433();
        if (!this.f81145 && this.f81148.m46660()) {
            if (ApplicationC17729.f58258.getBoolean("show_install_file_transfer", false)) {
                buttonM22433.setOnClickListener(new ViewOnClickListenerC18074(0, this));
            } else {
                buttonM22433.setVisibility(8);
                m55926(true);
            }
        } else {
            buttonM22433.setVisibility(8);
        }
        ((C1972) arrayList.get(i2)).m6791();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m55916(int i, String str) {
        this.f81141.add(new C1972(this, str, i));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m55938(C25093 c25093) {
        if (c25093.f81151) {
            return;
        }
        c25093.f81151 = true;
        C19871.m45732(c25093);
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static void m55929(C25093 c25093) {
        if (c25093.f81151 || !c25093.f81140.m22434() || c25093.f81145 || c25093.f81153 || c25093.f81146 != null || c25093.f81136 != 0) {
            return;
        }
        c25093.f81153 = true;
        c25093.f81142.postOnAnimation(new RunnableC8501(2, c25093));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m55934(C25093 c25093) {
        c25093.f81153 = false;
        if (!c25093.f81151 && c25093.f81140.m22434() && c25093.f81146 == null && c25093.f81136 == 0) {
            for (C1972 c1972 : c25093.f81141) {
                if (!c1972.f6623 && !c1972.f6621 && !c1972.f6617) {
                    c25093.f81146 = c1972;
                    c1972.m6791();
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m55913(C25093 c25093, String str, C12853 c12853) {
        ArrayList arrayList = new ArrayList();
        if ("built-in".equals(str)) {
            for (int i : DialogInterfaceOnDismissListenerC5102.m15443()) {
                arrayList.add(new C22109(C1512.m5367(i)));
            }
        } else {
            List<C17328> listM46656 = c25093.f81148.m46656(str);
            PackageManager packageManager = c25093.f81138.getPackageManager();
            C5396 c5396M16075 = C5396.m16075();
            for (C17328 c17328 : listM46656) {
                arrayList.add(new C22109(packageManager, c17328, c5396M16075.m16078(c12853, c17328), c5396M16075.m16079(c12853, c17328)));
            }
            final Collator collator = Collator.getInstance();
            Collections.sort(arrayList, new Comparator() { // from class: l.ۛۘᩴ
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    C22109 c22109 = (C22109) obj;
                    C22109 c221010 = (C22109) obj2;
                    int i2 = c221010.f71254;
                    C17328 c17329 = c221010.f71253;
                    int i3 = c22109.f71254;
                    C17328 c173210 = c22109.f71253;
                    int iCompare = Integer.compare(i2, i3);
                    if (iCompare == 0) {
                        iCompare = Integer.compare(c221010.f71255, c22109.f71255);
                    }
                    if (iCompare == 0) {
                        iCompare = collator.compare(c22109.f71256, c221010.f71256);
                    }
                    if (iCompare == 0) {
                        iCompare = c173210.m40676().compareTo(c17329.m40676());
                    }
                    return iCompare == 0 ? c173210.m40678().compareTo(c17329.m40678()) : iCompare;
                }
            });
            int size = arrayList.size();
            boolean[] zArr = new boolean[size];
            for (int i2 = 0; i2 < size - 1; i2++) {
                if (!zArr[i2]) {
                    C22109 c22109 = (C22109) arrayList.get(i2);
                    String strM40676 = c22109.f71253.m40676();
                    boolean z = false;
                    for (int i3 = i2 + 1; i3 < size; i3++) {
                        C22109 c221010 = (C22109) arrayList.get(i3);
                        String str2 = c221010.f71256;
                        C17328 c17329 = c221010.f71253;
                        if (str2.equals(c22109.f71256) && !strM40676.equals(c17329.m40676())) {
                            c221010.f71256 += "\n(" + c17329.m40676() + ')';
                            z = true;
                            zArr[i3] = true;
                        }
                    }
                    if (z) {
                        c22109.f71256 += "\n(" + c22109.f71253.m40676() + ')';
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m55926(boolean z) {
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(this.f81138);
        c2361.m8021(R.string.MT_Protector);
        c2361.m8000(R.string.MT_Protector);
        c2361.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC21741(1, this));
        c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        if (z) {
            c2361.m8018(R.string.MT_Protector, new DialogInterfaceOnClickListenerC0175());
        }
        c2361.m8016();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m55930(C25093 c25093) {
        AbstractActivityC17204 abstractActivityC17204 = c25093.f81138;
        try {
            AbstractC22044 abstractC22044M49876 = C6382.f21563.m49876("filetransfer.apk");
            abstractC22044M49876.m49840(abstractActivityC17204.getAssets().open("filetransfer.apk"));
            Uri uriM49878 = abstractC22044M49876.m49878();
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriM49878, "application/vnd.android.package-archive");
            intent.addFlags(268435456);
            C1112.m4126(intent, uriM49878);
            abstractActivityC17204.startActivity(intent);
        } catch (IOException e) {
            abstractActivityC17204.m40401(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
