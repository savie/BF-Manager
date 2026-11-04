.class public final synthetic Ll/ۙ᩻ۧ;
.super Ljava/lang/Object;
.source "51FV"

# interfaces
.implements Ll/᩶ܽ;
.implements Ll/ܽۧܺ;
.implements Ll/᩸ۛܽ;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۙ᩻ۧ;->ܰ:I

    iput-object p2, p0, Ll/ۙ᩻ۧ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public construct()Ljava/lang/Object;
    .locals 4

    .line 2
    iget-object v0, p0, Ll/ۙ᩻ۧ;->᩶:Ljava/lang/Object;

    .line 4
    check-cast v0, Ljava/lang/reflect/Type;

    .line 181
    instance-of v1, v0, Ljava/lang/reflect/ParameterizedType;

    const-string v2, "Invalid EnumSet type: "

    if-eqz v1, :cond_1

    .line 182
    move-object v1, v0

    check-cast v1, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v1

    const/4 v3, 0x0

    aget-object v1, v1, v3

    .line 183
    instance-of v3, v1, Ljava/lang/Class;

    if-eqz v3, :cond_0

    .line 185
    check-cast v1, Ljava/lang/Class;

    invoke-static {v1}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    return-object v0

    .line 188
    :cond_0
    new-instance v1, Ll/۟᩵ܽ;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 42
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 188
    throw v1

    .line 191
    :cond_1
    new-instance v1, Ll/۟᩵ܽ;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 42
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 191
    throw v1
.end method

.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 1

    .line 0
    iget v0, p0, Ll/ۙ᩻ۧ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll/ۙ᩻ۧ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/᩻᩹ۧ;

    invoke-static {v0, p1}, Ll/᩻᩹ۧ;->ۙ(Ll/᩻᩹ۧ;Landroid/view/MenuItem;)V

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Ll/ۙ᩻ۧ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ۛۖܳ;

    invoke-static {v0, p1}, Ll/ۛۖܳ;->ۙ(Ll/ۛۖܳ;Landroid/view/MenuItem;)V

    :goto_0
    const/4 p1, 0x1

    return p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public ۙ(I)V
    .locals 2

    .line 2
    iget-object v0, p0, Ll/ۙ᩻ۧ;->᩶:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ۘۧۧ;

    int-to-float p1, p1

    const v1, 0x3dcccccd    # 0.1f

    mul-float p1, p1, v1

    float-to-int p1, p1

    .line 913
    invoke-interface {v0, p1}, Ll/ۘۧۧ;->ۙ(I)V

    return-void
.end method
