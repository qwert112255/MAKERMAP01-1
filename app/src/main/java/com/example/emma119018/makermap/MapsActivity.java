package com.example.emma119018.makermap;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }



    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {


        googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        googleMap.getUiSettings().setZoomControlsEnabled(true);
        MarkerOptions makerOpt = new MarkerOptions();



        mMap = googleMap;


        // Add a marker in Sydne
        // y and move the camera
        LatLng FGU = new LatLng(24.816226, 121.722100);
        mMap.addMarker(new MarkerOptions()
                .position(FGU)
                .title("佛光大學")
                .snippet("宜蘭縣礁溪鄉林美村林尾路160號"+'\n'+"03-9871000#25321"));
        makerOpt.position(FGU);

        LatLng SBH = new LatLng(24.984116, 121.451362);
        mMap.addMarker(new MarkerOptions()
                .position(SBH)
                .title("新北高中Fablab"));
        makerOpt.position(SBH);


        LatLng HCH = new LatLng(25.007288, 121.447562);
        mMap.addMarker(new MarkerOptions()
                .position(HCH)
                .title("華僑高中FabLab"));
        makerOpt.position(HCH);

        LatLng KMS = new LatLng(25.063048, 121.500932);
        mMap.addMarker(new MarkerOptions()
                .position(KMS)
                .title("Kick2real Maker Space"));
        makerOpt.position(KMS);

        LatLng YDU = new LatLng(24.995194, 121.453119);
        mMap.addMarker(new MarkerOptions()
                .position(YDU)
                .title("亞東技術學院工商業設計系"));
        makerOpt.position(YDU);

        LatLng CH = new LatLng(24.994027, 121.478425);
        mMap.addMarker(new MarkerOptions()
                .position(CH)
                .title("創客中和"));
        makerOpt.position(CH);

        LatLng TUA = new LatLng(25.002459, 121.445736);
        mMap.addMarker(new MarkerOptions()
                .position(TUA)
                .title("國立台灣藝術大學文化創意產學園區"));
        makerOpt.position(TUA);

        LatLng DM = new LatLng(25.084958, 121.662885);
        mMap.addMarker(new MarkerOptions()
                .position(DM)
                .title("夢基地木創"));
        makerOpt.position(DM);

        LatLng S7W = new LatLng(24.976492, 121.541913);
        mMap.addMarker(new MarkerOptions()
                .position(S7W)
                .title("小七工作站"));
        makerOpt.position(S7W);

        LatLng DLU = new LatLng(24.972325, 121.455768);
        mMap.addMarker(new MarkerOptions()
                .position(DLU)
                .title("德霖技術學院3D列印實驗室"));
        makerOpt.position(DLU);

        LatLng GJH = new LatLng(25.073832, 121.488675);
        mMap.addMarker(new MarkerOptions()
                .position(GJH)
                .title("私立格致高中學FabLab"));
        makerOpt.position(GJH);

        LatLng RFJ = new LatLng(25.105614, 121.817488);
        mMap.addMarker(new MarkerOptions()
                .position(RFJ)
                .title("瑞芳國中"));
        makerOpt.position(RFJ);

        LatLng DNU = new LatLng(25.003296, 121.604445);
        mMap.addMarker(new MarkerOptions()
                .position(DNU)
                .title("東南科技大學數位模型製作空間"));
        makerOpt.position(DNU);

        LatLng IOT = new LatLng(25.066270, 121.449388);
        mMap.addMarker(new MarkerOptions()
                .position(IOT)
                .title("物聯網創客基地"));
        makerOpt.position(IOT);

        LatLng SHU = new LatLng(25.226969, 121.451654);
        mMap.addMarker(new MarkerOptions()
                .position(SHU)
                .title("聖約翰科技大學3D設計列印中心"));
        makerOpt.position(SHU);

        LatLng RS = new LatLng(25.058565, 121.543935);
        mMap.addMarker(new MarkerOptions()
                .position(RS)
                .title("3D如水同學會"));
        makerOpt.position(RS);

        LatLng FCT = new LatLng(25.044150, 121.529441);
        mMap.addMarker(new MarkerOptions()
                .position(FCT)
                .title("FabCafe Taipei"));
        makerOpt.position(FCT);

        LatLng FBT = new LatLng(25.029191, 121.516080);
        mMap.addMarker(new MarkerOptions()
                .position(FBT)
                .title("Fablab Taipei"));
        makerOpt.position(FBT);

        LatLng MBT = new LatLng(25.041241, 121.529483);
        mMap.addMarker(new MarkerOptions()
                .position(MBT)
                .title("Markerbar Taipei"));
        makerOpt.position(MBT);

        LatLng MP = new LatLng(25.025042, 121.523137);
        mMap.addMarker(new MarkerOptions()
                .position(MP)
                .title("MakerPro"));
        makerOpt.position(MP);

        LatLng NTU = new LatLng(25.015200, 121.537509);
        mMap.addMarker(new MarkerOptions()
                .position(NTU)
                .title("NTUMaker台灣大學"));
        makerOpt.position(NTU);

        LatLng OT = new LatLng(25.010834, 121.532407);
        mMap.addMarker(new MarkerOptions()
                .position(OT)
                .title("Openlab Taipei"));
        makerOpt.position(OT);

        LatLng TH = new LatLng(25.052901, 121.516884);
        mMap.addMarker(new MarkerOptions()
                .position(TH)
                .title("Taipei Hackerspace"));
        makerOpt.position(TH);

        LatLng TSE = new LatLng(24.990414, 121.559161);
        mMap.addMarker(new MarkerOptions()
                .position(TSE)
                .title("私立再興小學FabLab"));
        makerOpt.position(TSE);

        LatLng TTU = new LatLng(25.009193, 121.539071);
        mMap.addMarker(new MarkerOptions()
                .position(TTU)
                .title("國立台灣科技大學"));
        makerOpt.position(TTU);

        LatLng TUD = new LatLng(25.024624, 121.544637);
        mMap.addMarker(new MarkerOptions()
                .position(TUD)
                .title("國立台北教育大學創意自造中心&創客實驗室"));
        makerOpt.position(TUD);

        LatLng TNU = new LatLng(25.025951, 121.527489);
        mMap.addMarker(new MarkerOptions()
                .position(TNU)
                .title("國立臺灣師範大學自造大師基地"));
        makerOpt.position(TNU);

        LatLng DMC = new LatLng(25.071328, 121.595649);
        mMap.addMarker(new MarkerOptions()
                .position(DMC)
                .title("國防醫學院Fablab"));
        makerOpt.position(DMC);

        LatLng SCU = new LatLng(25.083272, 121.545147);
        mMap.addMarker(new MarkerOptions()
                .position(SCU)
                .title("實踐大學媒體傳達設計學系FABLAB"));
        makerOpt.position(SCU);

        LatLng DTU = new LatLng(25.067154, 121.521804);
        mMap.addMarker(new MarkerOptions()
                .position(DTU)
                .title("大同大學未來產房"));
        makerOpt.position(DTU);

        LatLng LDD = new LatLng(25.022494, 121.529927);
        mMap.addMarker(new MarkerOptions()
                .position(LDD)
                .title("綠點點點點 - 社區營造基地"));
        makerOpt.position(LDD);

        LatLng TY = new LatLng(25.038982, 121.522255);
        mMap.addMarker(new MarkerOptions()
                .position(TY)
                .title("台北市青少年發展處創新學習基地"));
        makerOpt.position(TY);

        LatLng YYD = new LatLng(25.085563, 121.523113);
        mMap.addMarker(new MarkerOptions()
                .position(YYD)
                .title("英業達雲豹1號夢工廠"));
        makerOpt.position(YYD);

        LatLng TNUH = new LatLng(25.033659, 121.540488);
        mMap.addMarker(new MarkerOptions()
                .position(TNUH)
                .title("師大附中附製工坊"));
        makerOpt.position(TNUH);

        LatLng MK = new LatLng(25.040631, 121.538083);
        mMap.addMarker(new MarkerOptions()
                .position(MK)
                .title("魅客空間"));
        makerOpt.position(MK);

        LatLng IF = new LatLng(25.042729, 121.538529);
        mMap.addMarker(new MarkerOptions()
                .position(IF)
                .title("點子工場 / 自造工坊"));
        makerOpt.position(IF);

        LatLng DMS = new LatLng(25.135276, 121.729937);
        mMap.addMarker(new MarkerOptions()
                .position(DMS)
                .title("3D創客新學園"));
        makerOpt.position(DMS);

        LatLng CYU = new LatLng(25.131924, 121.754456);
        mMap.addMarker(new MarkerOptions()
                .position(CYU)
                .title("崇右技術學院創意商品設計系"));
        makerOpt.position(CYU);

        LatLng AL = new LatLng(24.965604, 121.225492);
        mMap.addMarker(new MarkerOptions()
                .position(AL)
                .title("Ark Lab多旋翼工坊"));
        makerOpt.position(AL);

        LatLng LHU = new LatLng(25.017519, 121.402853);
        mMap.addMarker(new MarkerOptions()
                .position(LHU)
                .title("龍華科技大學Fablab"));
        makerOpt.position(LHU);

        LatLng NLU = new LatLng(24.978016, 121.255741);
        mMap.addMarker(new MarkerOptions()
                .position(NLU)
                .title("內壢高中FabLab"));
        makerOpt.position(NLU);

        LatLng NCU = new LatLng(24.968420, 121.195666);
        mMap.addMarker(new MarkerOptions()
                .position(NCU)
                .title("中央大學創意園區"));
        makerOpt.position(NCU);

        LatLng CYM = new LatLng(24.957498, 121.240539);
        mMap.addMarker(new MarkerOptions()
                .position(CYM)
                .title("中原大學創客夢工廠"));
        makerOpt.position(CYM);

        LatLng NYU = new LatLng(24.936878, 121.251668);
        mMap.addMarker(new MarkerOptions()
                .position(NYU)
                .title("南亞技術學院 南工創客實驗室"));
        makerOpt.position(NYU);

        LatLng GTR = new LatLng(25.006105, 121.235557);
        mMap.addMarker(new MarkerOptions()
                .position(GTR)
                .title("鋼鐵人實作基地"));
        makerOpt.position(GTR);

        LatLng YC = new LatLng(24.965753, 121.225882);
        mMap.addMarker(new MarkerOptions()
                .position(YC)
                .title("青創指揮部"));
        makerOpt.position(YC);

        LatLng ICFA = new LatLng(24.888284, 121.133733);
        mMap.addMarker(new MarkerOptions()
                .position(ICFA)
                .title("衣啟飛翔創客基地"));
        makerOpt.position(ICFA);

        LatLng ICFB = new LatLng(24.815689, 120.962720);
        mMap.addMarker(new MarkerOptions()
                .position(ICFB)
                .title("衣啟飛翔創客基地"));
        makerOpt.position(ICFB);

        LatLng CHU = new LatLng(24.796350, 120.995007);
        mMap.addMarker(new MarkerOptions()
                .position(CHU)
                .title("清華大學WeSchool維創工坊"));
        makerOpt.position(CHU);

        LatLng HCL = new LatLng(24.796936, 121.010941);
        mMap.addMarker(new MarkerOptions()
                .position(HCL)
                .title("新竹工具圖書館 / 般若來集成工程"));
        makerOpt.position(HCL);

        LatLng MSU = new LatLng(24.863851, 120.991217);
        mMap.addMarker(new MarkerOptions()
                .position(MSU)
                .title("明新科技大學"));
        makerOpt.position(MSU);

        LatLng CWC = new LatLng(24.803045, 120.953708);
        mMap.addMarker(new MarkerOptions()
                .position(CWC)
                .title("造物者工坊"));
        makerOpt.position(CWC);

        LatLng MLH = new LatLng(24.556469, 120.834083);
        mMap.addMarker(new MarkerOptions()
                .position(MLH)
                .title("苗栗農工FabLab"));
        makerOpt.position(MLH);

        LatLng LHM = new LatLng(24.545713, 120.812257);
        mMap.addMarker(new MarkerOptions()
                .position(LHM)
                .title("國立聯合大學創客空間"));
        makerOpt.position(LHM);

        LatLng TCH = new LatLng(24.113420, 120.661341);
        mMap.addMarker(new MarkerOptions()
                .position(TCH)
                .title("台中高工FabLab"));
        makerOpt.position(TCH);

        LatLng FCU = new LatLng(24.181635, 120.646415);
        mMap.addMarker(new MarkerOptions()
                .position(FCU)
                .title("逢甲大學G-Print創客中心"));
        makerOpt.position(FCU);

        LatLng LF = new LatLng(24.144772, 120.660387);
        mMap.addMarker(new MarkerOptions()
                .position(LF)
                .title("Linkin Factory聯合工廠"));
        makerOpt.position(LF);

        LatLng TCN = new LatLng(24.152130, 120.683696);
        mMap.addMarker(new MarkerOptions()
                .position(TCN)
                .title("TCN創客基地"));
        makerOpt.position(TCN);

        LatLng SPU = new LatLng(24.095313, 120.713765);
        mMap.addMarker(new MarkerOptions()
                .position(SPU)
                .title("修平科大智慧生活創新創業育成平台"));
        makerOpt.position(SPU);

        LatLng CYF = new LatLng(24.146558, 120.733358);
        mMap.addMarker(new MarkerOptions()
                .position(CYF)
                .title("國立勤益科技大學多功能實習工場"));
        makerOpt.position(CYF);

        LatLng CYT = new LatLng(24.072821, 120.715414);
        mMap.addMarker(new MarkerOptions()
                .position(CYT)
                .title("朝陽科技大學產學合作處創新創業發展中心"));
        makerOpt.position(CYT);

        LatLng THU = new LatLng(24.182416, 120.602728);
        mMap.addMarker(new MarkerOptions()
                .position(THU)
                .title("東海大學工業設計系Maker Studio"));
        makerOpt.position(THU);

        LatLng CSH = new LatLng(24.265249, 120.574098);
        mMap.addMarker(new MarkerOptions()
                .position(CSH)
                .title("清水高中自造實驗室"));
        makerOpt.position(CSH);

        LatLng BRF = new LatLng(24.092317, 120.582854);
        mMap.addMarker(new MarkerOptions()
                .position(BRF)
                .title("百忍工坊 - 木工忍者的現代工坊"));
        makerOpt.position(BRF);

        LatLng DCH = new LatLng(23.948164, 120.601044);
        mMap.addMarker(new MarkerOptions()
                .position(DCH)
                .title("私立大慶商工職業學校"));
        makerOpt.position(DCH);

        LatLng MOLI = new LatLng(23.950229, 120.930108);
        mMap.addMarker(new MarkerOptions()
                .position(MOLI)
                .title("MOLi創新自造者開放實驗室"));
        makerOpt.position(MOLI);

        LatLng NTM = new LatLng(23.903614, 120.689637);
        mMap.addMarker(new MarkerOptions()
                .position(NTM)
                .title("南投創客基地"));
        makerOpt.position(NTM);

        LatLng TDH = new LatLng(23.998420, 120.695346);
        mMap.addMarker(new MarkerOptions()
                .position(TDH)
                .title("同德家商"));
        makerOpt.position(TDH);

        LatLng NKU = new LatLng(23.979233, 120.696843);
        mMap.addMarker(new MarkerOptions()
                .position(NKU)
                .title("南開科技大學多媒體動畫應用系"));
        makerOpt.position(NKU);

        LatLng HWU = new LatLng(23.703108, 120.430151);
        mMap.addMarker(new MarkerOptions()
                .position(HWU)
                .title("國立虎尾科技大學創意夢工場"));
        makerOpt.position(HWU);

        LatLng YKD = new LatLng(23.695850, 120.534012);
        mMap.addMarker(new MarkerOptions()
                .position(YKD)
                .title("雲科大自造者基地：跨領域創意工場"));
        makerOpt.position(YKD);

        LatLng MV = new LatLng(23.561461, 120.473388);
        mMap.addMarker(new MarkerOptions()
                .position(MV)
                .title("Maker Village"));
        makerOpt.position(MV);

        LatLng NHU = new LatLng(23.569313, 120.494306);
        mMap.addMarker(new MarkerOptions()
                .position(NHU)
                .title("南華大學創意模型、造型設計、陶藝工坊" ));
        makerOpt.position(NHU);

        LatLng TTH = new LatLng(23.005492, 120.212414);
        mMap.addMarker(new MarkerOptions()
                .position(TTH)
                .title("台南二中FabLab" ));
        makerOpt.position(TTH);

        LatLng THH = new LatLng(22.993590, 120.151774);
        mMap.addMarker(new MarkerOptions()
                .position(THH)
                .title("台南海事FabLab" ));
        makerOpt.position(THH);

        LatLng TOG = new LatLng(23.012698, 120.227942);
        mMap.addMarker(new MarkerOptions()
                .position(TOG)
                .title("TO.GATHER自造者樂園" ));
        makerOpt.position(TOG);

        LatLng NFM = new LatLng(23.310677, 120.322653);
        mMap.addMarker(new MarkerOptions()
                .position(NFM)
                .title("南方創客基地" ));
        makerOpt.position(NFM);

        LatLng PD = new LatLng(22.991824, 120.205026);
        mMap.addMarker(new MarkerOptions()
                .position(PD)
                .title("台南胖地" ));
        makerOpt.position(PD);

        LatLng KSU = new LatLng(22.998268, 120.253104);
        mMap.addMarker(new MarkerOptions()
                .position(KSU)
                .title("崑山科技大學3D列印實習工廠&創新創意產品實作中心" ));
        makerOpt.position(KSU);

        LatLng CJCU = new LatLng(22.912056, 120.271943);
        mMap.addMarker(new MarkerOptions()
                .position(CJCU)
                .title("長榮大學O PLUS創新設計工坊" ));
        makerOpt.position(CJCU);

        LatLng NCKU = new LatLng(22.996244, 120.222172);
        mMap.addMarker(new MarkerOptions()
                .position(NCKU)
                .title("成電創客學園" ));
        makerOpt.position(NCKU);

        LatLng KSD = new LatLng(22.781978, 120.405125);
        mMap.addMarker(new MarkerOptions()
                .position(KSD)
                .title("高師大FabLab" ));
        makerOpt.position(KSD);

        LatLng FSH = new LatLng(22.634185, 120.358030);
        mMap.addMarker(new MarkerOptions()
                .position(FSH)
                .title("鳳山商工FabLab" ));
        makerOpt.position(FSH);

        LatLng FLM = new LatLng(22.756829, 120.335781);
        mMap.addMarker(new MarkerOptions()
                .position(FLM)
                .title("FI LAB創夢工場" ));
        makerOpt.position(FLM);

        LatLng ML = new LatLng(22.660073, 120.303301);
        mMap.addMarker(new MarkerOptions()
                .position(ML)
                .title("MakerLab創客萊吧" ));
        makerOpt.position(ML);

        LatLng MSC = new LatLng(22.593389, 120.308612);
        mMap.addMarker(new MarkerOptions()
                .position(MSC)
                .title("創客小棧" ));
        makerOpt.position(MSC);

        LatLng YSU = new LatLng(22.727172, 120.405822);
        mMap.addMarker(new MarkerOptions()
                .position(YSU)
                .title("義守大學智慧型機器人中心" ));
        makerOpt.position(YSU);

        LatLng NUK = new LatLng(22.734415, 120.285178);
        mMap.addMarker(new MarkerOptions()
                .position(NUK)
                .title("高雄大學應用物理學系" ));
        makerOpt.position(NUK);

        LatLng CCU = new LatLng(22.586783, 120.319752);
        mMap.addMarker(new MarkerOptions()
                .position(CCU)
                .title("前鎮高中" ));
        makerOpt.position(CCU);

        LatLng LCH = new LatLng(22.653742, 120.326524);
        mMap.addMarker(new MarkerOptions()
                .position(LCH)
                .title("立志高中" ));
        makerOpt.position(LCH);

        LatLng RSH = new LatLng(22.601546, 120.325369);
        mMap.addMarker(new MarkerOptions()
                .position(RSH)
                .title("瑞祥高中" ));
        makerOpt.position(RSH);

        LatLng KSC = new LatLng(22.622877, 120.306988);
        mMap.addMarker(new MarkerOptions()
                .position(KSC)
                .title("高雄造物者" ));
        makerOpt.position(KSC);

        LatLng HOM = new LatLng(22.675092, 120.485182);
        mMap.addMarker(new MarkerOptions()
                .position(HOM)
                .title("HO覓藝文實驗研究所" ));
        makerOpt.position(HOM);

        LatLng PTU = new LatLng(22.669347, 120.504438);
        mMap.addMarker(new MarkerOptions()
                .position(PTU)
                .title("屏東大學動手作科學教育中心" ));
        makerOpt.position(PTU);

        LatLng TFT = new LatLng(22.764905, 121.142299);
        mMap.addMarker(new MarkerOptions()
                .position(TFT)
                .title("台東大學Fablab Taitung台東自造" ));
        makerOpt.position(TFT);

        LatLng OZ = new LatLng(24.013355, 121.629540);
        mMap.addMarker(new MarkerOptions()
                .position(OZ)
                .title("工業技術研究院OMEGA ZONE" ));
        makerOpt.position(OZ);

        LatLng CZU = new LatLng(23.996759, 121.564754);
        mMap.addMarker(new MarkerOptions()
                .position(CZU)
                .title("慈濟科技大學創客空間" ));
        makerOpt.position(CZU);

        LatLng HLH = new LatLng(23.998651, 121.620594);
        mMap.addMarker(new MarkerOptions()
                .position(HLH)
                .title("花蓮高工東區自造實驗室" ));
        makerOpt.position(HLH);




        LatLng CENTER = new LatLng(23.973875,120.982024);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(CENTER,7));

        CustomInfoWindowAdapter adapter = new CustomInfoWindowAdapter(MapsActivity.this);
        googleMap.setInfoWindowAdapter(adapter);

    }
}
