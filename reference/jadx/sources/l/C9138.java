package l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡ᩷᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 67CI */
/* JADX INFO: loaded from: classes4.dex */
public final class C9138 extends AbstractC5609 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C9843 f31082;

    public C9138(Main main, C12665 c12665, C9843 c9843) {
        super(main, c9843.f33626, "drawer_expand_network_group_" + c9843.f33625, c12665, c9843.f33625);
        this.f31082 = c9843;
    }

    @Override // l.AbstractViewOnClickListenerC6314
    /* JADX INFO: renamed from: ۙ */
    public final void mo17412(AbstractViewOnLongClickListenerC22543 abstractViewOnLongClickListenerC22543) {
        super.mo17412(abstractViewOnLongClickListenerC22543);
        if (this.f21343.m31494()) {
            ((C17603) abstractViewOnLongClickListenerC22543).f73517.setText(this.f21339 + " (" + C16737.m39288(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_END);
        }
    }

    @Override // l.AbstractViewOnClickListenerC6314
    /* JADX INFO: renamed from: ۨ */
    public final int mo17413() {
        if (this.f21341) {
            return this.f21338.size() + 1;
        }
        return 1;
    }

    @Override // l.AbstractViewOnClickListenerC6314, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.f21343.m31494()) {
            return false;
        }
        C16195 c16195 = new C16195(this.f47137, view, 8388693);
        C2995.m8960(view);
        c16195.m38292();
        C12418 c12418M38298 = c16195.m38298();
        c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c16195.m38296(new C9058(this));
        c16195.m38297();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23461(final C9138 c9138, MenuItem menuItem) {
        C9843 c9843 = c9138.f31082;
        Main main = c9138.f47137;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            C3098 c3098 = new C3098(main, c9843);
            c3098.m40376(R.string.MT_Protector);
            c3098.m40346((CharSequence) c9843.f33626);
            c3098.m40340();
            c3098.m40355();
            c3098.m40368(true);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            C8067 c8067BuildDialog = main.buildDialog();
            c8067BuildDialog.m21274(R.string.MT_Protector);
            c8067BuildDialog.m21261(main.getString(R.string.MT_Protector, c9843.f33626));
            c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩵᩷᩹
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C4757.m13192(this.f63292.f31082.f33625);
                }
            });
            c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067BuildDialog.m21269();
            return;
        }
        if (itemId != R.string.MT_Protector) {
            if (itemId == R.string.MT_Protector) {
                AbstractC5609.m15482(main);
                return;
            }
            return;
        }
        C17492 c17492 = (C17492) main.m30995(R.layout.MT_Protector);
        final ArrayList arrayListM13207 = C4757.m13207();
        C2640 c2640 = new C2640(main, arrayListM13207);
        C7000.m18806(c17492, -1, C13932.m33769(6.0f), -1, -1);
        c17492.setAdapter(c2640);
        C4647 c4647 = new C4647(new C11814(arrayListM13207, c2640));
        c4647.m12825(c17492);
        c2640.m8147(c4647);
        C8067 c8067BuildDialog2 = main.buildDialog();
        c8067BuildDialog2.m21274(R.string.MT_Protector);
        c8067BuildDialog2.m21258(c17492);
        c8067BuildDialog2.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܰܺ᩹
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ArrayList arrayList = arrayListM13207;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Integer.valueOf(((C9843) it.next()).f33625));
                }
                C4757.m13198(arrayList2);
            }
        });
        c8067BuildDialog2.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog2.m21269();
    }
}
