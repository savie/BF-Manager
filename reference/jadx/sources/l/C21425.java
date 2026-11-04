package l;

import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩶ܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G6IL */
/* JADX INFO: loaded from: classes2.dex */
public final class C21425 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C2056 f68244;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public View f68245;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public View f68246;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ArrayList f68247;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C6509 f68248 = new InterfaceC16438() { // from class: l.ۛܺܳ
        @Override // l.InterfaceC16438
        /* JADX INFO: renamed from: ۙ */
        public final void mo1486(Object obj) {
            this.f21853.m48745();
        }
    };

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C21680 f68249 = new C21680(1, this);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f68250;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f68251;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f68252;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f68253;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public BaseAdapter f68254;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f68255;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static void m48740(C21425 c21425) {
        AbstractActivityC17204 abstractActivityC17204 = c21425.f68253;
        if (C17695.m41415().m41448()) {
            c21425.f68251 = false;
            c21425.f68255 = false;
            C17695.m41415().m41434();
            c21425.m48745();
            return;
        }
        if (C17695.m41415().m41440() == null) {
            c21425.f68244.m7102(true);
            return;
        }
        if (C7543.m20616(abstractActivityC17204)) {
            c21425.m48737();
        } else {
            if (C7543.m20616(abstractActivityC17204)) {
                return;
            }
            try {
                C7543.m20612(abstractActivityC17204, null);
            } catch (Exception e) {
                abstractActivityC17204.m40401(e, (DialogInterface.OnDismissListener) null);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ۛܺܳ] */
    public C21425(AbstractActivityC17204 abstractActivityC17204) {
        this.f68253 = abstractActivityC17204;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48749() {
        this.f68247 = C17695.m41415().m41435();
        this.f68254 = new C4271(this);
        AbstractActivityC17204 abstractActivityC17204 = this.f68253;
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        this.f68245 = viewM40395.findViewById(R.id.MT_Protector);
        this.f68246 = viewM40395.findViewById(R.id.MT_Protector);
        C14803 c14803 = (C14803) viewM40395.findViewById(R.id.MT_Protector);
        c14803.m35644(Math.round(abstractActivityC17204.getResources().getDisplayMetrics().density * 240.0f));
        this.f68245.setOnClickListener(new ViewOnClickListenerC7876(3, this));
        this.f68246.setOnClickListener(new ViewOnClickListenerC23663(0, this));
        c14803.setAdapter((ListAdapter) this.f68254);
        c14803.setEmptyView(viewM40395.findViewById(R.id.MT_Protector));
        c14803.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.ۗܺܳ
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                C21576.m49067((CharSequence) ((C18463) this.f12110.f68247.get(i)).f60090);
            }
        });
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        DialogInterfaceC8327 dialogInterfaceC8327M23911 = C8947.m23911(c2361BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f68252 = dialogInterfaceC8327M23911;
        this.f68244 = new C2056(abstractActivityC17204, dialogInterfaceC8327M23911, new RunnableC6915(2, this));
        C5416.m16144(this.f68252);
        this.f68252.m22426(new DialogInterface.OnDismissListener() { // from class: l.᩵ܺܳ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C21425.m48741(this.f66298);
            }
        });
        this.f68252.m22436().setOnClickListener(new ViewOnClickListenerC1342(2, this));
        this.f68252.m22440().setOnClickListener(new ViewOnClickListenerC12474());
        abstractActivityC17204.getLifecycle().mo23077(new C14711(this));
        C17695.m41415().m41443().m40350(abstractActivityC17204, this.f68248);
        C17695.m41415().m41417().m40350(abstractActivityC17204, this.f68249);
        m48745();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48741(C21425 c21425) {
        c21425.f68251 = false;
        c21425.f68255 = false;
        c21425.f68244.m7104();
        DialogInterfaceC8327 dialogInterfaceC8327 = c21425.f68250;
        if (dialogInterfaceC8327 != null) {
            dialogInterfaceC8327.dismiss();
        }
        C17695.m41415().m41443().m40354((InterfaceC16438) c21425.f68248);
        C17695.m41415().m41417().m40354((InterfaceC16438) c21425.f68249);
        AbstractActivityC17204 abstractActivityC17204 = c21425.f68253;
        if (abstractActivityC17204 instanceof ActivityC13220) {
            abstractActivityC17204.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m48745() {
        int i;
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f68252;
        if (dialogInterfaceC8327 == null || !dialogInterfaceC8327.m22434()) {
            return;
        }
        boolean z = C17695.m41415().m41440() != null;
        AbstractActivityC17204 abstractActivityC17204 = this.f68253;
        boolean zM20616 = C7543.m20616(abstractActivityC17204);
        if (this.f68255) {
            if (!zM20616) {
                this.f68255 = false;
            } else if (z && abstractActivityC17204.getLifecycle().mo23076() == EnumC2619.RESUMED) {
                this.f68255 = false;
                if (!C17695.m41415().m41448()) {
                    m48737();
                    return;
                }
            }
        }
        m48731(this.f68245, z);
        m48731(this.f68246, zM20616);
        if (C17695.m41415().m41448() && (!z || !zM20616)) {
            C17695.m41415().m41442();
        }
        boolean zM41448 = C17695.m41415().m41448();
        Button buttonM22436 = this.f68252.m22436();
        if (!this.f68251 || zM41448) {
            i = zM41448 ? R.string.MT_Protector : R.string.MT_Protector;
        } else {
            i = R.string.MT_Protector;
        }
        buttonM22436.setText(i);
        this.f68252.m22436().setEnabled((!this.f68251 || zM41448) && !C17695.m41415().m41433());
        ArrayList arrayListM41435 = C17695.m41415().m41435();
        this.f68247 = arrayListM41435;
        this.f68252.m22440().setVisibility(arrayListM41435.size() == 0 ? 8 : 0);
        this.f68254.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m48731(View view, boolean z) {
        int i;
        TextView textView = (TextView) view.findViewById(R.id.MT_Protector);
        if (z) {
            i = view == this.f68245 ? R.string.MT_Protector : R.string.MT_Protector;
        } else {
            i = R.string.MT_Protector;
        }
        textView.setText(i);
        ImageView imageView = (ImageView) view.findViewById(R.id.MT_Protector);
        imageView.setImageResource(z ? R.drawable.MT_Protector : R.drawable.MT_Protector);
        C12864.m31899(imageView, ColorStateList.valueOf(C7508.m20558(this.f68253, z ? R.color.MT_Protector : R.color.MT_Protector)));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m48747(final C21425 c21425) {
        final C17695 c17695M41415 = C17695.m41415();
        if (c17695M41415.m41433()) {
            return;
        }
        final C11750 c11750M41440 = c17695M41415.m41440();
        if (c11750M41440 == null) {
            c21425.f68244.m7102(false);
            return;
        }
        if (c21425.f68250 != null) {
            return;
        }
        C2361 c2361BuildDialog = c21425.f68253.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8000(R.string.MT_Protector);
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩺ܺܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C21425.m48735(this.f79206, c17695M41415, c11750M41440);
            }
        });
        DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
        c21425.f68250 = dialogInterfaceC8327M8016;
        dialogInterfaceC8327M8016.m22426(new DialogInterface.OnDismissListener() { // from class: l.ܶܺܳ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f52593.f68250 = null;
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48735(C21425 c21425, C17695 c17695, C11750 c11750) {
        AbstractActivityC17204 abstractActivityC17204 = c21425.f68253;
        if (c21425.f68252.m22434() && abstractActivityC17204.getLifecycle().mo23076() == EnumC2619.RESUMED && c17695.m41440() == c11750) {
            c21425.f68251 = false;
            c21425.f68255 = false;
            if (Build.VERSION.SDK_INT < 24 && !C22171.m50137(abstractActivityC17204, C7756.m21117())) {
                C2056.m7091();
                c17695.m41442();
                if (!c21425.f68244.m7103()) {
                    C22673.m51152(R.string.MT_Protector);
                }
            } else {
                c17695.m41445();
            }
            c21425.m48745();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48734(C21425 c21425, Integer num) {
        DialogInterfaceC8327 dialogInterfaceC8327 = c21425.f68252;
        if (dialogInterfaceC8327 == null || !dialogInterfaceC8327.m22434()) {
            return;
        }
        if (c21425.f68251 && num != null && num.intValue() == 2) {
            c21425.f68251 = false;
        }
        if (num != null && (num.intValue() == 3 || num.intValue() == 0)) {
            if (c21425.f68251 && num.intValue() == 3) {
                C22673.m51152(R.string.MT_Protector);
            }
            c21425.f68251 = false;
            c21425.f68255 = false;
        }
        c21425.m48745();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m48744(C21425 c21425) {
        AbstractActivityC17204 abstractActivityC17204 = c21425.f68253;
        if (C7543.m20616(abstractActivityC17204)) {
            return;
        }
        try {
            C7543.m20612(abstractActivityC17204, null);
        } catch (Exception e) {
            abstractActivityC17204.m40401(e, (DialogInterface.OnDismissListener) null);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m48738(C21425 c21425) {
        DialogInterfaceC8327 dialogInterfaceC8327 = c21425.f68252;
        if (dialogInterfaceC8327 != null && dialogInterfaceC8327.m22434() && c21425.f68253.getLifecycle().mo23076() == EnumC2619.RESUMED) {
            c21425.f68255 = true;
            c21425.m48745();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m48737() {
        this.f68255 = false;
        try {
            this.f68251 = true;
            m48745();
            C17695.m41415().m41447();
        } catch (Exception e) {
            this.f68251 = false;
            m48745();
            this.f68253.m40401(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
