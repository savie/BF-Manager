package l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextPaint;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩷֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1KB */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC20539 extends AbstractC12554 implements View.OnClickListener, View.OnLongClickListener, InterfaceC21133 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public TextView f66522;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public TextView f66523;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C1529 f66524;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15601 f66525;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f66526;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC20539(C15601 c15601, View view) {
        super(view);
        this.f66525 = c15601;
        this.f66523 = (TextView) view.findViewById(R.id.textView);
        this.f66522 = (TextView) view.findViewById(R.id.textView2);
        C0674.m3031(view);
        ((ImageView) view.findViewById(R.id.icon)).setImageDrawable(c15601.f50734.f33743);
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46317(String str) {
        int i;
        int i2;
        String strM32189 = C13012.m32189(50, C22627.m50150(str));
        TextView textView = this.f66523;
        textView.setText(strM32189);
        String strM321810 = C13012.m32189(200, str);
        TextView textView2 = this.f66522;
        textView2.setText(strM321810);
        TextPaint paint = textView.getPaint();
        TextPaint paint2 = textView2.getPaint();
        int flags = paint.getFlags();
        int flags2 = paint2.getFlags();
        C15601 c15601 = this.f66525;
        if (c15601.f50736 == null || c15601.f50736.m16563(str)) {
            this.f66526 = true;
            i = flags & (-17);
            i2 = flags2 & (-17);
            textView.setTextColor(C20368.f65976);
            textView2.setTextColor(C20368.f65976);
        } else {
            this.f66526 = false;
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
        final String string = this.f66522.getText().toString();
        C15601 c15601 = this.f66525;
        if (c15601.f50736 != null && !c15601.f50736.m16563(string)) {
            m46316(string);
        } else {
            C16737.m39274(new Runnable() { // from class: l.ۤ֨ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    C15601 c15602 = this.f34023.f66525;
                    if (c15602.f50736 != null) {
                        c15602.f50736.m16532(string);
                    }
                }
            }, 500L);
            ((ActivityC5677) c15601.requireActivity()).m15660(string, (C8500) null);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C16195 c16195 = new C16195(this.f66525.requireContext(), view, 0);
        this.f66524 = new C1529(c16195, this.f66522.getText().toString(), true);
        if (this.f66526) {
            c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c16195.m38296(this);
        c16195.m38297();
        return true;
    }

    @Override // l.InterfaceC21133
    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (!this.f66524.m5303(menuItem)) {
            String string = this.f66522.getText().toString();
            int itemId = menuItem.getItemId();
            C15601 c15601 = this.f66525;
            if (itemId == R.string.MT_Protector) {
                c15601.f50733.m42626(string);
                return true;
            }
            if (c15601.f50736 != null) {
                m46316(string);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m46316(final String str) {
        C15601 c15601 = this.f66525;
        Context contextRequireContext = c15601.requireContext();
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(contextRequireContext);
        c8067.m21274(R.string.MT_Protector);
        c8067.m21261(c15601.getString(R.string.MT_Protector, this.f66523.getText()));
        c8067.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۟֨ۜ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f23842.f66525.f50736.m16555(str);
            }
        });
        c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067.m21269();
    }
}
