package l;

import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܽܺ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4ZV */
/* JADX INFO: loaded from: classes5.dex */
public final class C16753 extends AbstractViewOnClickListenerC6314 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static HashMap f53635 = new HashMap();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f53636 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f53637;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private synchronized void m39309() {
        this.f21338.clear();
        this.f21338.add(new C20281(this, this.f47137, R.string.MT_Protector, "/", "/system", C0690.f2923));
        this.f21338.add(new C20281(this, this.f47137, R.string.MT_Protector, C11904.f39934.mo33986(), (String) null, C0690.f2927));
        for (C18149 c18149 : (ArrayList) C8272.m21692()) {
            String path = c18149.f58039.getPath();
            this.f21338.add(new C20281(this, this.f47137, c18149.f58040, path, C0690.f2927, (C18295) null));
        }
        this.f53637 = this.f21338.size();
        for (C18295 c18295 : C19001.m43714()) {
            String strM42503 = c18295.m42503();
            this.f21338.add(new C20281(this, this.f47137, c18295.f58377, strM42503, C0690.f2900, c18295));
        }
        f53635.clear();
        for (int i = 0; i < this.f21338.size(); i++) {
            C20281 c20281 = (C20281) this.f21338.get(i);
            String str = c20281.f65728;
            if (str != null) {
                f53635.put(str.toLowerCase(), c20281.f65726);
            }
        }
        for (C18295 c18296 : C19001.m43704()) {
            C9735.putIfAbsent(f53635, c18296.m42503().toLowerCase(), c18296.f58377);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39306(C16753 c16753, C0524 c0524) {
        c16753.getClass();
        int bindingAdapterPosition = c0524.getBindingAdapterPosition();
        C12665 c12665 = c16753.f21343;
        int iM31486 = (bindingAdapterPosition - c12665.m31486(c16753)) - 1;
        if (iM31486 >= c16753.f53637) {
            c16753.f21338.remove(iM31486);
            C19001.m43709(iM31486 - c16753.f53637);
            c12665.notifyItemRangeRemoved(bindingAdapterPosition, 1);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39307(C16753 c16753, C0524 c0524, C0524 c0525) {
        c16753.getClass();
        int bindingAdapterPosition = c0524.getBindingAdapterPosition();
        int bindingAdapterPosition2 = c0525.getBindingAdapterPosition();
        C12665 c12665 = c16753.f21343;
        int iM31486 = (bindingAdapterPosition - c12665.m31486(c16753)) - 1;
        int iM31487 = (bindingAdapterPosition2 - c12665.m31486(c16753)) - 1;
        int i = c16753.f53637;
        C19001.m43710(iM31486 - i, iM31487 - i);
        C23520.m51798(iM31486, iM31487, c16753.f21338);
        c12665.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m39310(C16753 c16753, C0524 c0524) {
        c16753.getClass();
        int bindingAdapterPosition = c0524.getBindingAdapterPosition();
        C12665 c12665 = c16753.f21343;
        int iM31486 = (bindingAdapterPosition - c12665.m31486(c16753)) - 1;
        if (iM31486 >= c16753.f53637) {
            c16753.f21338.remove(iM31486);
            C19001.m43720(iM31486 - c16753.f53637);
            c12665.notifyItemRangeRemoved(bindingAdapterPosition, 1);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.ۡܺ᩹] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.ۤܺ᩹] */
    public C16753(Main main, final C12665 c12665) {
        String strM39288 = C16737.m39288(R.string.MT_Protector);
        super(main, strM39288, strM39288, c12665);
        C8272.m21691(main, new InterfaceC10597() { // from class: l.ۡܺ᩹
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                C16753.m39311(this.f30762, c12665);
            }
        });
        C19001.m43712(main, (C10403) new InterfaceC10597() { // from class: l.ۤܺ᩹
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                C16753.m39308(this.f35581, c12665);
            }
        });
        m39309();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39311(C16753 c16753, C12665 c12665) {
        c16753.m39309();
        c12665.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39308(C16753 c16753, C12665 c12665) {
        c16753.m39309();
        c12665.notifyDataSetChanged();
    }

    @Override // l.AbstractViewOnClickListenerC6314
    /* JADX INFO: renamed from: ۖ */
    public final void mo17411() {
        m39309();
    }

    @Override // l.AbstractViewOnClickListenerC6314, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.f21343.m31494()) {
            return false;
        }
        C16195 c16195 = new C16195(this.f47137, view, 8388693);
        C2995.m8960(view);
        c16195.m38292();
        c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c16195.m38296(new InterfaceC21133() { // from class: l.۟ܺ᩹
            @Override // l.InterfaceC21133
            public final boolean onMenuItemClick(MenuItem menuItem) {
                if (menuItem.getItemId() != R.string.MT_Protector) {
                    return false;
                }
                this.f25106.f47137.m136();
                return true;
            }
        });
        c16195.m38297();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m39305(String str) {
        if (str.length() > 1 && str.endsWith("/")) {
            str = C20630.m46498(1, 0, str);
        }
        return (String) f53635.get(str.toLowerCase());
    }

    @Override // l.AbstractViewOnClickListenerC6314
    /* JADX INFO: renamed from: ۙ */
    public final void mo15483(AbstractViewOnLongClickListenerC22543 abstractViewOnLongClickListenerC22543, int i) {
        long jM22975;
        long jM22976;
        C0524 c0524 = (C0524) abstractViewOnLongClickListenerC22543;
        C20281 c20281 = (C20281) this.f21338.get(i);
        c0524.f2215 = c20281;
        TextView textView = c0524.f73514;
        c0524.f73517.setText(c20281.f65726);
        c0524.f2213.m48700(EnumC15552.Visible);
        String string = "";
        if (c20281.f65727 == null) {
            String str = c20281.f65725;
            C21901 c21901 = c0524.f2213;
            try {
                if (str.equals("/")) {
                    C15383 c15383M48492 = C21732.m48492();
                    if (c15383M48492 != null) {
                        jM22975 = c15383M48492.m36820();
                        jM22976 = c15383M48492.m36821();
                    } else {
                        C8847 c8847 = new C8847("/system", "/data");
                        jM22975 = c8847.m22975();
                        jM22976 = c8847.m22976();
                    }
                } else {
                    C8847 c8848 = new C8847(str);
                    long jM22977 = c8848.m22975();
                    long jM22978 = c8848.m22976();
                    jM22975 = jM22977;
                    jM22976 = jM22978;
                }
                if (jM22976 != 0) {
                    long j = jM22976 - jM22975;
                    c21901.m48699((int) ((100 * j) / jM22976));
                    string = c21901.getContext().getString(R.string.MT_Protector, C1791.m5863(j), C1791.m5863(jM22975));
                }
            } catch (Throwable unused) {
            }
            textView.setText(string);
        } else {
            textView.setText("");
        }
        if (textView.length() == 0) {
            c0524.f2213.m48699(0);
            c0524.f2213.m48700(EnumC15552.Invisible);
            textView.setText(c20281.f65728);
        }
        c0524.f73512.m27921(c20281.f65729.f2944);
        c0524.itemView.setOnClickListener(c20281);
        this.f21343.m31492((AbstractViewOnLongClickListenerC22543) c0524);
    }
}
