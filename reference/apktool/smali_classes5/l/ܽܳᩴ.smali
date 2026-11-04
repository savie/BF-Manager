.class public final Ll/ܽܳᩴ;
.super Ljava/lang/Object;
.source "N7PP"

# interfaces
.implements Ll/ۚܳᩴ;


# virtual methods
.method public final ۙ(ILl/᩹ۖ᩸;Landroid/widget/Button;)Ll/ᩳܳᩴ;
    .locals 0

    const p1, 0x7f0a061c

    .line 286
    invoke-virtual {p3, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩳܳᩴ;

    if-nez p1, :cond_0

    .line 288
    invoke-static {p3}, Ll/ۚۚᩴ;->᩸(Landroid/view/View;)V

    const/4 p1, 0x0

    :cond_0
    return-object p1
.end method

.method public final ۙ(Landroid/widget/Button;Ll/ۚۚᩴ;)V
    .locals 13

    const v0, 0x7f0a061c

    .line 196
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶܳᩴ;

    if-nez v0, :cond_0

    .line 197
    new-instance v0, Lbin/mt/json/JSONObject;

    invoke-direct {v0}, Lbin/mt/json/JSONObject;-><init>()V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ll/ܶܳᩴ;->᩸()Lbin/mt/json/JSONObject;

    move-result-object v0

    :goto_0
    const v1, 0x7f0d0101

    .line 198
    invoke-virtual {p2, v1}, Ll/ܽ֡֫;->ۙ(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f0a0186

    .line 199
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ll/᩹ۖ᩸;

    const v2, 0x7f0a0187

    .line 200
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ll/᩹ۖ᩸;

    const v2, 0x7f0a05c5

    .line 201
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Ll/֨ܶ;

    const v2, 0x7f0a05c6

    .line 202
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Ll/֨ܶ;

    const v2, 0x7f0a05a0

    .line 203
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Landroid/widget/Spinner;

    const v2, 0x7f0a0188

    .line 204
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Ll/᩹ۖ᩸;

    const v2, 0x7f120af1

    .line 206
    invoke-virtual {p2, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f12020f

    .line 207
    invoke-virtual {p2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    const v10, 0x7f120c1e

    .line 208
    invoke-virtual {p2, v10}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v10

    const v11, 0x7f120c1d

    .line 209
    invoke-virtual {p2, v11}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v11

    const v12, 0x7f120417

    .line 210
    invoke-virtual {p2, v12}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v12

    filled-new-array {v2, v3, v10, v11, v12}, [Ljava/lang/String;

    move-result-object v2

    .line 212
    new-instance v3, Ll/ۗ֡᩻;

    invoke-direct {v3, p2, v2}, Ll/ۗ֡᩻;-><init>(Landroid/content/Context;[Ljava/lang/Object;)V

    invoke-virtual {v8, v3}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 213
    new-instance v2, Ll/ܺۤۚ;

    const/4 v3, 0x1

    invoke-direct {v2, v4, v5, v3}, Ll/ܺۤۚ;-><init>(Landroid/view/View;Landroid/view/View;I)V

    invoke-virtual {v7, v2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const-string v2, "a"

    .line 217
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    const-string v2, "b"

    .line 218
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    const-string v2, "c"

    .line 219
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    invoke-virtual {v6, v2}, Ll/֨ܶ;->setChecked(Z)V

    const-string v2, "d"

    .line 220
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    if-ltz v2, :cond_1

    const/4 v3, 0x4

    if-le v2, v3, :cond_2

    :cond_1
    const/4 v2, 0x0

    .line 221
    :cond_2
    invoke-virtual {v8, v2}, Landroid/widget/AdapterView;->setSelection(I)V

    const-string v2, "e"

    .line 222
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    if-gtz v2, :cond_3

    const-string v2, ""

    goto :goto_1

    .line 223
    :cond_3
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    :goto_1
    invoke-virtual {v9, v2}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    const-string v2, "f"

    const/4 v3, 0x1

    .line 224
    invoke-virtual {v0, v2, v3}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 225
    invoke-virtual {v7, v0}, Ll/֨ܶ;->setChecked(Z)V

    .line 226
    invoke-virtual {p2}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v0

    .line 227
    invoke-virtual {v0, v1}, Ll/ۖۖۧ;->ۙ(Landroid/view/View;)V

    const v1, 0x7f1208c9

    const v2, 0x7f120161

    const/4 v3, 0x0

    .line 0
    invoke-static {v0, v1, v3, v2, v3}, Ll/ܰ۟ۙ;->ۙ(Ll/ۖۖۧ;ILandroid/content/DialogInterface$OnClickListener;ILandroid/content/DialogInterface$OnClickListener;)Ll/۠ۖۧ;

    move-result-object v12

    .line 231
    invoke-virtual {v12}, Ll/۠ۖۧ;->ᩴ()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Ll/ܺܳᩴ;

    move-object v3, v1

    move-object v10, p2

    move-object v11, p1

    invoke-direct/range {v3 .. v12}, Ll/ܺܳᩴ;-><init>(Ll/᩹ۖ᩸;Ll/᩹ۖ᩸;Ll/֨ܶ;Ll/֨ܶ;Landroid/widget/Spinner;Ll/᩹ۖ᩸;Ll/ۚۚᩴ;Landroid/widget/Button;Ll/۠ۖۧ;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final ۙ(Ll/᩹ۖ᩸;Landroid/widget/TextView;Landroid/widget/Button;)V
    .locals 1

    const/16 v0, 0x8

    .line 189
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    const/4 p1, 0x0

    .line 190
    invoke-virtual {p3, p1}, Landroid/view/View;->setVisibility(I)V

    .line 191
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final ۙ(Ll/᩹ۖ᩸;Landroid/widget/TextView;Landroid/widget/Button;Ll/ᩳܳᩴ;)V
    .locals 1

    const v0, 0x7f0a061c

    .line 183
    invoke-virtual {p3, v0, p4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 184
    invoke-virtual {p0, p1, p2, p3}, Ll/ܽܳᩴ;->ۙ(Ll/᩹ۖ᩸;Landroid/widget/TextView;Landroid/widget/Button;)V

    return-void
.end method
