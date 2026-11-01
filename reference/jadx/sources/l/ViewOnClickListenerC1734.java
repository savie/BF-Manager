package l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextPaint;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֫ۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1KB */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC1734 extends AbstractC12554 implements View.OnClickListener, View.OnLongClickListener, InterfaceC21133 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9497 f6846;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f6847;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public TextView f6848;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TextView f6849;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC1734(C9497 c9497, View view) {
        super(view);
        this.f6846 = c9497;
        this.f6848 = (TextView) view.findViewById(R.id.textView);
        this.f6849 = (TextView) view.findViewById(R.id.textView2);
        C0674.m3031(view);
        ((ImageView) view.findViewById(R.id.icon)).setImageDrawable(c9497.f32140.f33743);
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5748(String str) {
        int i;
        int i2;
        String strM32189 = C13012.m32189(50, C22627.m50150(str));
        TextView textView = this.f6848;
        textView.setText(strM32189);
        String strM321810 = C13012.m32189(200, str);
        TextView textView2 = this.f6849;
        textView2.setText(strM321810);
        TextPaint paint = textView.getPaint();
        TextPaint paint2 = textView2.getPaint();
        int flags = paint.getFlags();
        int flags2 = paint2.getFlags();
        C9497 c9497 = this.f6846;
        if (c9497.f32142 == null || c9497.f32142.m21609(str)) {
            this.f6847 = true;
            i = flags & (-17);
            i2 = flags2 & (-17);
            textView.setTextColor(C20368.f65976);
            textView2.setTextColor(C20368.f65976);
        } else {
            this.f6847 = false;
            i = flags | 16;
            i2 = flags2 | 16;
            textView.setTextColor(C20368.f66009);
            textView2.setTextColor(C20368.f66009);
        }
        paint.setFlags(i);
        paint2.setFlags(i2);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C9886.f33734.m50803()) {
            return;
        }
        final String string = this.f6849.getText().toString();
        C9497 c9497 = this.f6846;
        if (c9497.f32142 != null && !c9497.f32142.m21609(string)) {
            m5747(string);
        } else {
            C16737.m39274(new Runnable() { // from class: l.᩻ۢۘ
                @Override // java.lang.Runnable
                public final void run() {
                    C9497 c9498 = this.f76491.f6846;
                    if (c9498.f32142 != null) {
                        c9498.f32142.m21575(string);
                    }
                }
            }, 500L);
            ((ActivityC5677) c9497.requireActivity()).m15674(string, (C8500) null);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C16195 c16195 = new C16195(this.f6846.requireContext(), view, 0);
        if (this.f6847) {
            c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c16195.m38296(this);
        c16195.m38297();
        return true;
    }

    @Override // l.InterfaceC21133
    public final boolean onMenuItemClick(MenuItem menuItem) {
        String string = this.f6849.getText().toString();
        int itemId = menuItem.getItemId();
        C9497 c9497 = this.f6846;
        if (itemId == R.string.MT_Protector) {
            c9497.f32139.m42650(string);
            return true;
        }
        if (c9497.f32142 == null) {
            return true;
        }
        m5747(string);
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m5747(final String str) {
        C9497 c9497 = this.f6846;
        Context contextRequireContext = c9497.requireContext();
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(contextRequireContext);
        c8067.m21274(R.string.MT_Protector);
        c8067.m21261(c9497.getString(R.string.MT_Protector, this.f6848.getText()));
        c8067.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܳۢۘ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f47320.f6846.f32142.m21593(str);
            }
        });
        c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067.m21269();
    }
}
