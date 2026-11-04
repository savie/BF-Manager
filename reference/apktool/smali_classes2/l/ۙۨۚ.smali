.class public final synthetic Ll/ۙۨۚ;
.super Ljava/lang/Object;
.source "H78K"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic ܰ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۙۨۚ;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 3

    .line 2
    iget v0, p0, Ll/ۙۨۚ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Ll/۟ۛ۫;

    .line 9
    check-cast p2, Ll/۟ۛ۫;

    .line 11
    sget v0, Ll/᩹ܿ۫;->ۖ:I

    .line 199
    invoke-virtual {p1}, Ll/۟ۛ۫;->ۙ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    .line 200
    invoke-virtual {p2}, Ll/۟ۛ۫;->ۙ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-ne v0, v1, :cond_2

    .line 202
    invoke-virtual {p1}, Ll/۟ۛ۫;->ۙ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ll/۟ۛ۫;->ۙ()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result p1

    goto :goto_1

    .line 0
    :pswitch_0
    check-cast p1, Ll/᩹ۚۚ;

    check-cast p2, Ll/᩹ۚۚ;

    .line 336
    iget-object v0, p1, Ll/᩹ۚۚ;->᩷:Ljava/lang/String;

    iget-object v1, p2, Ll/᩹ۚۚ;->᩷:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 340
    :cond_0
    iget-object v0, p1, Ll/᩹ۚۚ;->ۤ:Ljava/lang/String;

    iget-object v1, p2, Ll/᩹ۚۚ;->ۤ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 344
    :cond_1
    iget p1, p1, Ll/᩹ۚۚ;->ۙ:I

    iget p2, p2, Ll/᩹ۚۚ;->ۙ:I

    invoke-static {p1, p2}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    :goto_0
    return v0

    :cond_2
    if-eqz v0, :cond_3

    const/4 p1, 0x1

    goto :goto_1

    :cond_3
    const/4 p1, -0x1

    :goto_1
    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
