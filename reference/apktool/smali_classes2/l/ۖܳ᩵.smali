.class public final Ll/ۖܳ᩵;
.super Ljava/lang/Object;
.source "R6IG"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic ܰ:Ll/۠ܳ᩵;


# direct methods
.method public constructor <init>(Ll/۠ܳ᩵;)V
    .locals 0

    .line 371
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖܳ᩵;->ܰ:Ll/۠ܳ᩵;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .line 371
    check-cast p1, Ll/֫֨ۗ;

    check-cast p2, Ll/֫֨ۗ;

    .line 374
    iget-object v0, p0, Ll/ۖܳ᩵;->ܰ:Ll/۠ܳ᩵;

    invoke-virtual {v0, p1, p2}, Ll/۠ܳ᩵;->ۙ(Ll/֫֨ۗ;Ll/֫֨ۗ;)Ll/ۜܳ᩵;

    move-result-object p1

    .line 375
    sget-object p2, Ll/ۡܳ᩵;->᩷:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    const/4 p2, 0x1

    if-eq p1, p2, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    const/4 v0, 0x5

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    return p2

    :cond_1
    const/4 p1, -0x1

    return p1

    :cond_2
    const/4 p1, -0x2

    return p1
.end method
