package GUI;

import BLL.PNhapBLL;
import BLL.PXuatBLL;
import DTO.PNhapDTO;
import DTO.PXuatDTO;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;


public class Chart_TienXuatTheoKH extends JFrame{

    static ArrayList<PXuatDTO> arr = new ArrayList<PXuatDTO>();
    
    Chart_TienXuatTheoKH(){
        ChartPanel chartPanel = new ChartPanel(createChart());
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
        chartPanel.setBackground(Color.PINK);
        JFrame frame = new JFrame();
        frame.add(chartPanel);        
        frame.setSize(1280, 595);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    public static JFreeChart createChart() {
        JFreeChart barChart = ChartFactory.createBarChart(
                "THỐNG KÊ SỐ TIỀN XUẤT HÀNG THEO KHÁCH HÀNG",
                "Mã Khách hàng", "Số tiền",
                createDataset(), PlotOrientation.VERTICAL, false, false, false);
        return barChart;
    }

    private static CategoryDataset createDataset() {
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
	PXuatBLL pxBLL = new PXuatBLL();
	arr = pxBLL.TK_TienTheoKH();
        PXuatDTO pxDTO = new PXuatDTO();
	for (int i = 0; i < arr.size(); i++) {
            pxDTO = arr.get(i);
            String Id=pxDTO.getMA_KH();            
            int tien=pxDTO.getTONG_TIEN();
            dataset.addValue(tien,"Số tiền",Id);
	}        
        return dataset;
    }

    

}