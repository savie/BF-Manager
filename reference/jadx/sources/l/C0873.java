package l;

import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.֨ۖܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4ZV */
/* JADX INFO: loaded from: classes3.dex */
public final class C0873 extends AbstractViewOnClickListenerC8526 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static HashMap f3258 = new HashMap();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f3259 = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f3260;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private synchronized void m3562() {
        this.f27858.clear();
        this.f27858.add(new C18772(this, this.f22654, R.string.MT_Protector, "/", "/system", C20613.f66108));
        this.f27858.add(new C18772(this, this.f22654, R.string.MT_Protector, C6382.f21566.mo4294(), (String) null, C20613.f66077));
        for (C16997 c16997 : (ArrayList) C17743.m41556()) {
            String path = c16997.f55538.getPath();
            this.f27858.add(new C18772(this, this.f22654, c16997.f55539, path, C20613.f66077, (C25291) null));
        }
        this.f3260 = this.f27858.size();
        for (C25291 c25291 : C17085.m40236()) {
            String strM56469 = c25291.m56469();
            this.f27858.add(new C18772(this, this.f22654, c25291.f81686, strM56469, C20613.f66109, c25291));
        }
        f3258.clear();
        for (int i = 0; i < this.f27858.size(); i++) {
            C18772 c18772 = (C18772) this.f27858.get(i);
            String str = c18772.f60974;
            if (str != null) {
                f3258.put(str.toLowerCase(), c18772.f60975);
            }
        }
        for (C25291 c25292 : C17085.m40241()) {
            C11392.putIfAbsent(f3258, c25292.m56469().toLowerCase(), c25292.f81686);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3560(C0873 c0873, C9821 c9821) {
        c0873.getClass();
        int bindingAdapterPosition = c9821.getBindingAdapterPosition();
        C9271 c9271 = c0873.f27860;
        int iM24474 = (bindingAdapterPosition - c9271.m24474(c0873)) - 1;
        if (iM24474 >= c0873.f3260) {
            c0873.f27858.remove(iM24474);
            C17085.m40228(iM24474 - c0873.f3260);
            c9271.notifyItemRangeRemoved(bindingAdapterPosition, 1);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3561(C0873 c0873, C9821 c9821, C9821 c9822) {
        c0873.getClass();
        int bindingAdapterPosition = c9821.getBindingAdapterPosition();
        int bindingAdapterPosition2 = c9822.getBindingAdapterPosition();
        C9271 c9271 = c0873.f27860;
        int iM24474 = (bindingAdapterPosition - c9271.m24474(c0873)) - 1;
        int iM24475 = (bindingAdapterPosition2 - c9271.m24474(c0873)) - 1;
        int i = c0873.f3260;
        C17085.m40229(iM24474 - i, iM24475 - i);
        C9911.m25734(iM24474, iM24475, c0873.f27858);
        c9271.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m3564(C0873 c0873, C9821 c9821) {
        c0873.getClass();
        int bindingAdapterPosition = c9821.getBindingAdapterPosition();
        C9271 c9271 = c0873.f27860;
        int iM24474 = (bindingAdapterPosition - c9271.m24474(c0873)) - 1;
        if (iM24474 >= c0873.f3260) {
            c0873.f27858.remove(iM24474);
            C17085.m40240(iM24474 - c0873.f3260);
            c9271.notifyItemRangeRemoved(bindingAdapterPosition, 1);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.ۘۖܳ] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.ܰۖܳ] */
    public C0873(Main main, final C9271 c9271) {
        String strM49088 = C21576.m49088(R.string.MT_Protector);
        super(main, strM49088, strM49088, c9271);
        C17743.m41555(main, new InterfaceC16438() { // from class: l.ۘۖܳ
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                C0873.m3563(this.f13168, c9271);
            }
        });
        C17085.m40231(main, (C14296) new InterfaceC16438() { // from class: l.ܰۖܳ
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                C0873.m3559(this.f45140, c9271);
            }
        });
        m3562();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3563(C0873 c0873, C9271 c9271) {
        c0873.m3562();
        c9271.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3559(C0873 c0873, C9271 c9271) {
        c0873.m3562();
        c9271.notifyDataSetChanged();
    }

    @Override // l.AbstractViewOnClickListenerC8526
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo3566() {
        m3562();
    }

    @Override // l.AbstractViewOnClickListenerC8526, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.f27860.m24482()) {
            return false;
        }
        C18452 c18452 = new C18452(this.f22654, view, 8388693);
        C10378.m26694(view);
        c18452.m42997();
        c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c18452.m42994(new InterfaceC21436() { // from class: l.᩶ۖܳ
            @Override // l.InterfaceC21436
            public final boolean onMenuItemClick(MenuItem menuItem) {
                if (menuItem.getItemId() != R.string.MT_Protector) {
                    return false;
                }
                this.f67178.f22654.m130();
                return true;
            }
        });
        c18452.mo21878();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m3558(String str) {
        if (str.length() > 1 && str.endsWith("/")) {
            str = C1402.m5124(1, 0, str);
        }
        return (String) f3258.get(str.toLowerCase());
    }

    @Override // l.AbstractViewOnClickListenerC8526
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3565(AbstractViewOnLongClickListenerC5544 abstractViewOnLongClickListenerC5544, int i) {
        long jM47682;
        long jM47683;
        C9821 c9821 = (C9821) abstractViewOnLongClickListenerC5544;
        C18772 c18772 = (C18772) this.f27858.get(i);
        c9821.f31634 = c18772;
        TextView textView = c9821.f19262;
        c9821.f19266.setText(c18772.f60975);
        c9821.f31632.m45007(EnumC22446.Visible);
        String string = "";
        if (c18772.f60973 == null) {
            String str = c18772.f60976;
            C19462 c19462 = c9821.f31632;
            try {
                if (str.equals("/")) {
                    C17102 c17102M41697 = C17848.m41697();
                    if (c17102M41697 != null) {
                        jM47682 = c17102M41697.m40263();
                        jM47683 = c17102M41697.m40264();
                    } else {
                        C20854 c20854 = new C20854("/system", "/data");
                        jM47682 = c20854.m47682();
                        jM47683 = c20854.m47683();
                    }
                } else {
                    C20854 c20855 = new C20854(str);
                    long jM47684 = c20855.m47682();
                    long jM47685 = c20855.m47683();
                    jM47682 = jM47684;
                    jM47683 = jM47685;
                }
                if (jM47683 != 0) {
                    long j = jM47683 - jM47682;
                    c19462.m45006((int) ((100 * j) / jM47683));
                    string = c19462.getContext().getString(R.string.MT_Protector, C8311.m22390(j), C8311.m22390(jM47682));
                }
            } catch (Throwable unused) {
            }
            textView.setText(string);
        } else {
            textView.setText("");
        }
        if (textView.length() == 0) {
            c9821.f31632.m45006(0);
            c9821.f31632.m45007(EnumC22446.Invisible);
            textView.setText(c18772.f60974);
        }
        c9821.f19265.m9864(c18772.f60972.f66117);
        c9821.itemView.setOnClickListener(c18772);
        this.f27860.m24477((AbstractViewOnLongClickListenerC5544) c9821);
    }
}
