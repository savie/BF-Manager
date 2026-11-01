package l;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩶۟ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: I8G2 */
/* JADX INFO: loaded from: classes4.dex */
public class C20027 extends LinearLayout {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f64134;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final CheckedTextView f64135;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f64136;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final CheckedTextView f64137;

    public C20027(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C20027(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        ViewOnClickListenerC20732 viewOnClickListenerC20732 = new ViewOnClickListenerC20732(this);
        new C15763(getResources());
        new ArrayList();
        this.f64136 = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f64137 = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(bin.mt.plus.R.string.MT_Protector);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(viewOnClickListenerC20732);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(bin.mt.plus.R.layout.MT_Protector, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f64135 = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(bin.mt.plus.R.string.MT_Protector);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(viewOnClickListenerC20732);
        addView(checkedTextView2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45356(C20027 c20027, View view) {
        CheckedTextView checkedTextView = c20027.f64135;
        HashMap map = c20027.f64136;
        CheckedTextView checkedTextView2 = c20027.f64137;
        if (view == checkedTextView2) {
            c20027.f64134 = true;
            map.clear();
        } else if (view == checkedTextView) {
            c20027.f64134 = false;
            map.clear();
        } else {
            c20027.f64134 = false;
            Object tag = view.getTag();
            tag.getClass();
            throw null;
        }
        checkedTextView2.setChecked(c20027.f64134);
        checkedTextView.setChecked(!c20027.f64134 && map.isEmpty());
        throw null;
    }
}
